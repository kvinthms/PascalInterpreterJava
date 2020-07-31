package interpreter;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EvalVisitor extends InterpreterBaseVisitor<Value> {

    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    HashMap<String, String[]> varmem = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    Boolean continueCheck = true;
    Boolean breakCheck = true;

    @Override
    public Value visitAssignment(InterpreterParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        if (varmem.get(id)[0].equalsIgnoreCase("constant")) {
            throw new java.lang.RuntimeException("Cannot assign a value to a constant variable");
        }
        if(varmem.get(id) != null){
            varmem.replace(id, new String[]{varmem.get(id)[0],value.asString()});
        }
        return Value.VOID;
    }

    @Override
    public Value visitConstDec(InterpreterParser.ConstDecContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        varmem.put(id, new String[]{"constant",value.asString()});
        return Value.VOID;
    }

    @Override
    public Value visitIdAtom(InterpreterParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = new Value(varmem.get(id)[1]);
        if(value == null) {
            throw new RuntimeException("no such variable or assignment: " + id);
        }
        return value;
    }

    @Override
    public Value visitStringAtom(InterpreterParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(InterpreterParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(InterpreterParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(InterpreterParser.NilAtomContext ctx) {
        return new Value(null);
    }

    @Override
    public Value visitParExpr(InterpreterParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitPowExpr(InterpreterParser.PowExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    @Override
    public Value visitExpExpr(InterpreterParser.ExpExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(Math.exp(value.asDouble()));
    }

    @Override
    public Value visitSinExpr(InterpreterParser.SinExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(Math.sin(value.asDouble()));
    }

    @Override
    public Value visitCosExpr(InterpreterParser.CosExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(Math.cos(value.asDouble()));
    }

    @Override
    public Value visitLnExpr(InterpreterParser.LnExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(Math.log(value.asDouble()));
    }

    @Override
    public Value visitSqrtExpr(InterpreterParser.SqrtExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(Math.sqrt(value.asDouble()));
    }

    @Override
    public Value visitUnaryMinusExpr(InterpreterParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(InterpreterParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(@NotNull InterpreterParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case InterpreterParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case InterpreterParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case InterpreterParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + InterpreterParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAdditiveExpr(@NotNull InterpreterParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case InterpreterParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case InterpreterParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + InterpreterParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr(@NotNull InterpreterParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case InterpreterParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case InterpreterParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case InterpreterParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case InterpreterParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + InterpreterParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr(@NotNull InterpreterParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case InterpreterParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case InterpreterParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + InterpreterParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(InterpreterParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(InterpreterParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitWrite(InterpreterParser.WriteContext ctx) {
        int i = 0;
        while(true){
            if(ctx.expr(i) != null){
                Value value = this.visit(ctx.expr(i));
                if(value.asString().equalsIgnoreCase("true"))
                    System.out.print("TRUE");
                else if(value.asString().equalsIgnoreCase("false"))
                    System.out.print("FALSE");
                else
                    System.out.print(value);
            }
            else{
                System.out.print('\n');
                break;
            }
            i++;
        }
        return Value.VOID;
    }

    @Override
    public Value visitRead(InterpreterParser.ReadContext ctx) {
        int i = 0;
        while(true){
            if(ctx.ID(i) != null){
                if(varmem.containsKey(ctx.ID(i).getText())){
                    String input;
                    input = scanner.nextLine();
                    if((input.toLowerCase()).equals("true") || (input.toLowerCase()).equals("false")){
                        if((varmem.get(ctx.ID(i).getText())[0].toLowerCase()).equals("boolean")){
                            varmem.replace(ctx.ID(i).getText(),new String[]{varmem.get(ctx.ID(i).getText())[0],input.toUpperCase()});
                        }
                    }
                    else if(input.matches("-?\\d+(\\.\\d+)?")){
                        varmem.replace(ctx.ID(i).getText(),new String[]{varmem.get(ctx.ID(i).getText())[0],input});
                    }
                }
            }
            else{
                break;
            }
            i++;
        }
        return Value.VOID;
    }

    @Override
    public Value visitVarDec(InterpreterParser.VarDecContext ctx) {
        int i = 0;
        while(true){
            if (ctx.ID(i) != null){
                varmem.put(ctx.ID(i).getText(), new String[]{ctx.type().getText(),null});
            } else {
                break;
            }
            i++;
        }
        return Value.VOID;
    }

    @Override
    public Value visitCase_stat(InterpreterParser.Case_statContext ctx) {
        int i = 0;
        Value evaluated = this.visit(ctx.expr());
        while(true){
            try{
                if(ctx.ID(i) != null){
                    if(evaluated.asString().equals(ctx.ID(i).getText())){
                        this.visit(ctx.stat_block(i));
                        break;
                    }
                }
                else if (ctx.INT(i) != null) {
                    if (evaluated.asString().equals(ctx.INT(i).getText())) {
                        this.visit(ctx.stat_block(i));
                        break;
                    }
                }
            } catch (Exception e) {
                break;
            }
            i++;
        }
        return Value.VOID;
    }

    @Override
    public Value visitIf_stat(InterpreterParser.If_statContext ctx) {

        List<InterpreterParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(InterpreterParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    @Override
    public Value visitStat(InterpreterParser.StatContext ctx) {
        if(ctx.BREAK() != null){
            breakCheck = false;
        }
        else if(ctx.CONTINUE() != null){
            continueCheck = false;
        }
        if(breakCheck && continueCheck)
            return visitChildren(ctx);
        else
            return Value.VOID;
    }

    @Override
    public Value visitWhile_stat(InterpreterParser.While_statContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());
            if(!breakCheck)
                break;
            else if(!continueCheck)
                continueCheck = true;

            // evaluate the expression
            value = this.visit(ctx.expr());
        }
        continueCheck = true;
        breakCheck = true;
        return Value.VOID;
    }

    @Override
    public Value visitFor_stat(InterpreterParser.For_statContext ctx) {
        Value upperlimit = this.visit(ctx.expr());
        String lowerlimitVar = ctx.assignment().ID().getText();
        this.visit(ctx.assignment());

        while(upperlimit.asDouble() >= Double.parseDouble(varmem.get(lowerlimitVar)[1])) {

            // evaluate the code block
            this.visit(ctx.stat_block());
            if(!breakCheck)
                break;
            else if(!continueCheck)
                continueCheck = true;
            varmem.replace(lowerlimitVar, new String[]{varmem.get(lowerlimitVar)[0], String.valueOf(Double.parseDouble(varmem.get(lowerlimitVar)[1]) + 1)});
        }
        continueCheck = true;
        breakCheck = true;
        return Value.VOID;
    }
}
