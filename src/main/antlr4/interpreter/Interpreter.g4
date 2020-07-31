grammar Interpreter;

parse
 : heading (varBlock | constBlock | function | procedure)* stat_block '.' EOF
 ;

heading
 : PROGRAM ID ('(' ID* ')')? SCOL;

assignment
 : ID ':=' expr
 ;

block
 : (stat SCOL)*
 ;

stat
 : assignment
 | if_stat
 | while_stat
 | for_stat
 | case_stat
 | write
 | read
 | CONTINUE
 | BREAK
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

varBlock
 : VAR varDec+
 ;

constBlock
 : CONST constDec+ SCOL
 ;

constDec
 : ID EQ expr
 ;

varDec
 : ID (',' ID)* ':' type SCOL
 ;

function
 : FUNCTION definition ':' type ';' functBlock ';'
 ;

procedure
 : PROCEDURE definition ';' procBlock ';'
 ;

definition
 : ID OPAR userVarDec (',' userVarDec)* CPAR
 ;

 userVarDec
  : ID (',' ID)* ':' type
  ;

functBlock
 : (varBlock | constBlock | function | procedure)* BEGIN block assignment END
 ;

procBlock
 : (varBlock | constBlock | function | procedure)* BEGIN block END
 ;

 type
 : BOOLEAN
 | REAL
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

case_stat
 : CASE expr OF ((ID|INT) ':' stat_block ';'?)+ END
 ;

condition_block
 : expr THEN stat_block
 ;

stat_block
 : BEGIN block END
 | stat
 ;

while_stat
 : WHILE expr DO stat_block
 ;

for_stat
 : FOR assignment TO expr DO stat_block
 ;

write
 : (WRITELN | WRITE) '(' expr (',' expr)* ')'
 ;

read
 : (READLN | READ) '(' ID (',' ID)* ')'
 ;

expr
 : <assoc=right> expr POW expr           #powExpr
 | SIN '(' expr ')'                     #sinExpr
 | COS '(' expr ')'                     #cosExpr
 | LN '(' expr ')'                      #lnExpr
 | EXP '(' expr ')'                     #expExpr
 | SQRT '(' expr ')'                    #sqrtExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

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

EQ : '=';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
SCOL : ';';
ASSIGN : ':=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
DOT: '.';

NOT : N O T;
OR : O R;
AND : A N D;
TRUE : T R U E;
FALSE : F A L S E;
IF : I F;
ELSE : E L S E;
WHILE : W H I L E;
BOOLEAN: B O O L E A N;
CASE: C A S E;
CONST: C O N S T;
COS: C O S;
DO: D O;
END: E N D;
BEGIN: B E G I N;
EXP: E X P;
FOR: F O R;
FUNCTION: F U N C T I O N;
LN: L N;
NIL: N I L;
PROCEDURE: P R O C E D U R E;
PROGRAM: P R O G R A M;
READ: R E A D;
READLN: R E A D L N;
REAL: R E A L;
SIN: S I N;
SQRT: S Q R T;
THEN: T H E N;
VAR: V A R;
WRITE: W R I T E;
WRITELN: W R I T E L N;
OF: O F;
CONTINUE: C O N T I N U E;
BREAK: B R E A K;
TO: T O;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]* 
 | '.' [0-9]+
 ;

STRING
 : '\'' ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' | '.' | ',' | ':' | '?' | ~[']+)* '\''
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : . 
 ;

COMMENT
 : '(*' .*? '*)' -> skip
 ;
