grammar Interpreter; 

@header {
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;
    import javax.script.ScriptEngineManager;
    import javax.script.ScriptEngine;
    import javax.script.ScriptException;
    import javax.script.ScriptContext;
    import javax.script.Bindings;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
}

@members {
    HashMap<String, String[]> varmem = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String input;
    String temp1 = "";
    String temp2 = "";
    Double tempRet = 0.0;
    Boolean evalBool = true;
}

//Starting point
program: heading block DOT EOF;

//Get Program name
heading: PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI;

//everything else: var declaration block and main block
block: (declarationPart)* compoundStatement;

declarationPart: variableDeclarationPart    #VarDeclaration
    | constantDeclarationPart               #ConstDeclaration
    | userDeclarationPart                   #UserDeclaration;

userDeclarationPart: functOrProc (SEMI functOrProc)* SEMI;

functOrProc: function   #UserFunction
    | procedure         #UserProcedure;

function: FUNCTION definition COLON type SEMI functBlock;

functBlock: (declarationPart)* functCompoundStatement;

functCompoundStatement: BEGIN (statements SEMI)? result END;

result: varAssignment (SEMI)?;

procedure: PROCEDURE definition SEMI block;

definition: identifier LPAREN variableDeclaration (COMMA variableDeclaration)* RPAREN;

//VARIABLE STUFFS
//var1: integer; var2: boolean;
variableDeclarationPart: VAR (variableDeclaration SEMI)+;

//var1, var 2: [var type]
variableDeclaration: identifierList COLON type
    {
        temp1 = $identifierList.text;
        for(int i=0;i<temp1.length();i++){
            if(temp1.charAt(i) != ','){
                temp2 += temp1.charAt(i);
            }
            if(temp1.charAt(i) == ',' || i == temp1.length() - 1){
                varmem.put(temp2, new String[]{$type.text,null});
                temp2 = "";
            }
        }
        temp1 = "";
        temp2 = "";
    }
;

constantDeclarationPart: CONST (constantDeclaration SEMI)+;

constantDeclaration: identifier EQUAL constVar {varmem.put($identifier.text, new String[]{"constant", $constVar.text});};

constVar: (MINUS)? NUM_INT
    | (MINUS)? NUM_REAL;

//ex: var1, var2
identifierList: identifier (COMMA identifier)*;

//calls identifier tokenizer
identifier: IDENT;

// Real or Boolean type declaration //INTEGER FOR TESTING
type: BOOLEAN   #IsBoolean
    | REAL      #Float
    | INTEGER   #Int;

//Main code block stuffs
compoundStatement: BEGIN statements END;

statements: statement (SEMI statement)*;

//Various statements found in main code block between begin and end
statement: varAssignment    #VarAssign
    | decisStates           #Decision
    | specialExp            #Special
    | emptyStmt             #Empty
    | loop                  #Looping
    | break                 #Breaking
    | continue              #Continuing;

break: BREAK;

continue: CONTINUE;

emptyStmt: ;

//var1 := 42; var2 := false;
varAssignment: var ASSIGN expression
    {
        if(evalBool){
            if(varmem.containsKey($var.text)){
                //System.out.println("varass: " + $expression.text);
                String vtype = varmem.get($var.text)[0];
                if (vtype.equalsIgnoreCase("constant")) {
                    throw new java.lang.RuntimeException("Cannot assign a value to a constant variable");
                } else if(vtype.equalsIgnoreCase("boolean")){
                    varmem.replace($var.text,new String[]{vtype,$expression.text});
                } else varmem.replace($var.text,new String[]{vtype,$expression.s2});
            }
        }
    }
;

var: identifier;

expression returns [String s2]: term (operator expression)*
    {
        //System.out.println("1. Term s5: " + $term.s5 + " operator: " + $operator.text + " expression: " + $expression.text);
        //System.out.println("2. Term s5: " + $term.s5 + " operator: " + $operator.text + " expression: " + $expression.s2);
        String foo = $term.s5;
        if($operator.text != null && !$operator.text.isEmpty()) {
            foo = foo + " " + $operator.text + " " + $expression.s2;
        }
                //System.out.println("3. Term s5: " + $term.s5 + " operator: " + $operator.text + " expression: " + $expression.text);
        /*
        if(($term.s5) != null && !($term.s5).isEmpty()){
            if(($operator.text) != null && !($operator.text).isEmpty()){
                foo = ($term.s5) + " " + $operator.text + " " + $expression.text;
            }
        } */
        if (foo != null && !foo.isEmpty()) {
            foo = foo.replaceAll("(?i)and", "&&");
            foo = foo.replaceAll("(?i)or", "||");
            foo = foo.replaceAll("(?i)not", "!");
            foo = foo.replaceAll("(?i)<>", "!=");
            foo = foo.replaceAll("(?i)=", "==");
        }
                //System.out.println("4. Term s5: " + $term.s5 + " operator: " + $operator.text + " expression: " + $expression.text);
        try {
            //System.out.println("foo: " + foo);
            //System.out.println(engine.eval(foo));
            if(foo != null && !foo.isEmpty()) {
                $s2 = engine.eval(foo).toString();
            } else $s2 = "foo is null";
        } catch (Exception e) {
            //System.out.println(e);
        }
    }
;

term returns [String s5]:
        (MINUS)? NUM_REAL         {
            if($MINUS.text != null && !$MINUS.text.isEmpty()) {
                $s5 = '-'+$NUM_REAL.text;
            } else $s5 = $NUM_REAL.text;
        }
                                                                        #TermFloat
    |   (MINUS)? NUM_INT
        {
            if($MINUS.text != null && !$MINUS.text.isEmpty()) {
                $s5 = '-'+$NUM_INT.text;
            } else $s5 = $NUM_INT.text;
        }
                                                                        #TermInt
    |   LPAREN expression RPAREN    {$s5 = '('+$expression.s2+')';}     #Parenthesis
    |   STRINGLITERAL               {$s5 = $STRINGLITERAL.text;}        #String
    |   bool                        {$s5 = $bool.s;}                    #Boolean
    |   var                         {$s5 = varmem.get($var.text)[1];}   #Variable
    |   specialFunct                {$s5 = $specialFunct.s3;}           #SpecialFunction
;

bool returns [String s]: (NOT)* (TRUE | FALSE)
    |   NOT NOT bool {$s = "" + $bool.s;}
    |   NOT var {
            String type = varmem.get($var.text)[0];
            if(!type.equalsIgnoreCase("real")) {
                if (type.equalsIgnoreCase("integer")) {
                    int x = Integer.parseInt(varmem.get($var.text)[1]);
                    x = -x-1;
                    $s = Integer.toString(x);
                } else $s = "NOT" + $var.text;
            } else throw new java.lang.RuntimeException("Cannot negate a real variable");
        }
    |   var {$s = varmem.get($var.text)[1];}
    |   NOT NUM_INT {
            int x = Integer.parseInt($NUM_INT.text);
            x = -x-1;
            $s = Integer.toString(x);
        }
    |   NUM_INT {$s = $NUM_INT.text;}
    ;

operator: boolExp   #BooleanExp
    | arithExp      #ArithmeticExp
    | relatExp      #RelationalExp;

//Special Expression Functions
specialExp: readFunct   #Read
    | writeFunct        #Write
    | specialFunct      #SpcMath;

specialFunct returns [String s3] : sqrtFunct {$s3 = $sqrtFunct.s1;}
    |   sinFunct    {$s3 = $sinFunct.s1;}
    |   cosFunct    {$s3 = $cosFunct.s1;}
    |   lnFunct     {$s3 = $lnFunct.s1;}
    |   expFunct    {$s3 = $expFunct.s1;}
;

readFunct: (READ | READLN) LPAREN e1 = expression {if(evalBool){
                                                               if(varmem.containsKey($e1.text)){
                                                                   input = scanner.nextLine();
                                                                   if((input.toLowerCase()).equals("true") || (input.toLowerCase()).equals("false")){
                                                                       if((varmem.get($e1.text)[0].toLowerCase()).equals("boolean")){
                                                                           varmem.replace($e1.text,new String[]{varmem.get($e1.text)[0],input.toUpperCase()});
                                                                       }
                                                                   }
                                                                   else if(input.matches("-?\\d+(\\.\\d+)?")){
                                                                         varmem.replace($e1.text,new String[]{varmem.get($e1.text)[0],input});
                                                                   }
                                                               }
                                                           }} (COMMA e2 = expression {if(evalBool){
                                                                                        if(varmem.containsKey($e2.text)){
                                                                                            input = scanner.nextLine();
                                                                                            if((input.toLowerCase()).equals("true") || (input.toLowerCase()).equals("false")){
                                                                                                if((varmem.get($e2.text)[0].toLowerCase()).equals("boolean")){
                                                                                                    varmem.replace($e2.text,new String[]{varmem.get($e2.text)[0],input.toUpperCase()});
                                                                                                }
                                                                                            }
                                                                                            else if(input.matches("-?\\d+(\\.\\d+)?")){
                                                                                                  varmem.replace($e2.text,new String[]{varmem.get($e2.text)[0],input});
                                                                                            }
                                                                                        }
                                                                                    }})* RPAREN
;

writeFunct: (WRITE | WRITELN) LPAREN e1 = expression {if(evalBool){
                                                                  //Removes quotes from string: ex. write('hello world') makes hello world instead of 'hello world'
                                                                  if(($e1.text).charAt(0) == '\'' && ($e1.text).charAt(($e1.text).length()-1) == '\''){
                                                                      System.out.print(($e1.text).substring(1,($e1.text).length()-1));
                                                                  }
                                                                  else{
                                                                      System.out.print($e1.s2);
                                                                  }
                                                              }} (COMMA e2 = expression {if(evalBool){
                                                                                                     //Removes quotes from string: ex. write('hello world') makes hello world instead of 'hello world'
                                                                                                     if(($e2.text).charAt(0) == '\'' && ($e2.text).charAt(($e2.text).length()-1) == '\''){
                                                                                                         System.out.print(($e2.text).substring(1,($e2.text).length()-1));
                                                                                                     }
                                                                                                     else{
                                                                                                         System.out.print($e2.s2);
                                                                                                     }
                                                                                                 }})* RPAREN
    {
        if(evalBool){
            System.out.print('\n');
        }
    }
;

sqrtFunct returns [String s1]: SQRT LPAREN expression RPAREN
    {
        String foo = "Math.sqrt(" + $expression.s2 + ")";
        try{$s1 = engine.eval(foo).toString();}
        catch(Exception e){}
    }
;

sinFunct returns [String s1]: SIN LPAREN expression RPAREN
    {
        String foo = "Math.sin(" + $expression.s2 + ")";
        try{$s1 = engine.eval(foo).toString();}
        catch(Exception e){}
    }
;

cosFunct returns [String s1]: COS LPAREN expression RPAREN
    {
        String foo = "Math.cos(" + $expression.s2 + ")";
        try{$s1 = engine.eval(foo).toString();}
        catch(Exception e){}
    }
;

lnFunct returns [String s1]: LN LPAREN expression RPAREN
    {
        String foo = "Math.log(" + $expression.s2 + ")";
        try{$s1 = engine.eval(foo).toString();}
        catch(Exception e){}
    }
;

expFunct returns [String s1]: EXP LPAREN expression RPAREN
    {
        String foo = "Math.exp(" + $expression.s2 + ")";
        try{$s1 = engine.eval(foo).toString();}
        catch(Exception e){}
    }
;

boolExp: AND | OR;

relatExp: LT | LE | GE | GT | EQUAL | NOT_EQUAL;

arithExp: STAR | (SLASH | DIV) | MOD | PLUS | MINUS;

decisStates: ifthenelse | caseStmt;

ifthenelse: IF expression THEN {evalBool=false;} {if(Boolean.parseBoolean($expression.s2)){evalBool=true;}} (st1 = statement | cst1 = compoundStatement) {evalBool=false;}
            (: ELSE {if(!Boolean.parseBoolean($expression.s2)){evalBool=true;}} (st2 = statement | cst2 = compoundStatement))? {evalBool=true;}
;

caseStmt: CASE expression OF {evalBool=false;} (spcIdent COLON
{   //System.out.println(($spcIdent.text).toString());
    if(($expression.s2).toString().equals(($spcIdent.text).toString())){
        evalBool=true;
    }
} (statement | compoundStatement) {evalBool=false;}) (SEMI spcIdent COLON
                                                {
                                                    if(($expression.s2).toString().equals(($spcIdent.text).toString())){
                                                        evalBool=true;
                                                    }
                                                } (statement | compoundStatement) {evalBool=false;})* END {evalBool=true;} (SEMI)?;

spcIdent: SPC | IDENT | STRINGLITERAL | NUM_INT | NUM_REAL;

loop: whileloop #While
    | forloop   #For;

whileloop: WHILE expression DO (statementType) ;

forloop: FOR expression DO (statementType) ;

statementType: statement    #SingleStatement
    | compoundStatement     #MultiStatement;

//Lexar Tokens
//Letter Tokenizer - Really just makes case sensitive not sensitive
fragment A: ('a' | 'A');
fragment B: ('b' | 'B');
fragment C: ('c' | 'C');
fragment D: ('d' | 'D');
fragment E: ('e' | 'E');
fragment F: ('f' | 'F');
fragment G: ('g' | 'G');
fragment H: ('h' | 'H');
fragment I: ('i' | 'I');
fragment J: ('j' | 'J');
fragment K: ('k' | 'K');
fragment L: ('l' | 'L');
fragment M: ('m' | 'M');
fragment N: ('n' | 'N');
fragment O: ('o' | 'O');
fragment P: ('p' | 'P');
fragment Q: ('q' | 'Q');
fragment R: ('r' | 'R');
fragment S: ('s' | 'S');
fragment T: ('t' | 'T');
fragment U: ('u' | 'U');
fragment V: ('v' | 'V');
fragment W: ('w' | 'W');
fragment X: ('x' | 'X');
fragment Y: ('y' | 'Y');
fragment Z: ('z' | 'Z');

AND: A N D;

ARRAY: A R R A Y;

BEGIN: B E G I N;

BREAK: B R E A K;

BOOLEAN: B O O L E A N;

CASE: C A S E;

CHAR: C H A R;

CHR: C H R;

CONST: C O N S T;

CONTINUE: C O N T I N U E;

COS: C O S;

DIV: D I V;

DO: D O;

DOWNTO: D O W N T O;

ELSE: E L S E;

END: E N D;

EXP: E X P;

FILE: F I L E;

FOR: F O R;

FUNCTION: F U N C T I O N;

GOTO: G O T O;

IF: I F;

IN: I N;

INTEGER: I N T E G E R;

LABEL: L A B E L;

LN: L N;

MOD: M O D;

NIL: N I L;

NOT: N O T;

OF: O F;

OR: O R;

PACKED: P A C K E D;

PROCEDURE: P R O C E D U R E;

PROGRAM: P R O G R A M;

READ: R E A D;

READLN: R E A D L N;

REAL: R E A L;

RECORD: R E C O R D;

REPEAT: R E P E A T;

SET: S E T;

SIN: S I N;

SQRT: S Q R T;

THEN: T H E N;

TO: T O;

TYPE: T Y P E;

UNTIL: U N T I L;

VAR: V A R;

WHILE: W H I L E;

WITH: W I T H;

WRITE: W R I T E;

WRITELN: W R I T E L N;

PLUS: '+';

MINUS: '-';

STAR: '*';

SLASH: '/';

ASSIGN: ':=';

COMMA: ',';

SEMI: ';';

COLON: ':';

EQUAL: '=';

NOT_EQUAL: '<>';

LT: '<';

LE: '<=';

GE: '>=';

GT: '>';

LPAREN: '(';

RPAREN: ')';

LBRACK: '[';

LBRACK2: '(.';

RBRACK: ']';

RBRACK2: '.)';

POINTER: '^';

AT: '@';

DOT: '.';

DOTDOT: '..';

LCURLY: '{';

RCURLY: '}';

UNIT: U N I T;

INTERFACE: I N T E R F A C E;

USES: U S E S;

STRING: S T R I N G;

IMPLEMENTATION: I M P L E M E N T A T I O N;

TRUE: T R U E;

FALSE: F A L S E;

WS: [ \t\r\n] -> skip;

COMMENT: '(*' .*? '*)' -> skip;

IDENT: ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;

STRINGLITERAL: '\'' ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' | '.' | ',' | ':' | '?' | ~[']+)* '\'' ;

NUM_INT: ('0' .. '9') +;

NUM_REAL: ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT);

SPC: ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;

fragment EXPONENT: ('e') ('+' | '-')? ('0' .. '9') +;
