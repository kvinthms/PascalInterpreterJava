package interpreter;

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

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class CustomVisitor extends InterpreterBaseVisitor<Value> {
    HashMap<String, String[]> varmem = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String input;
    String temp1 = "";
    String temp2 = "";
    Double tempRet = 0.0;
    Boolean evalBool = true;

//    @Override public Value visitWhileloop(@NotNull InterpreterParser.WhileloopContext ctx) {
//        System.out.println("enter while loop");
//        System.out.println(visitChildren(ctx));
//        return visitChildren(ctx);
//    }

    @Override public Value visitExpression(@NotNull InterpreterParser.ExpressionContext ctx) {
        System.out.println(ctx.s2);
        return visitChildren(ctx);
    }
}
