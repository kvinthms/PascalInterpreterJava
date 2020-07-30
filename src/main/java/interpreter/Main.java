package interpreter;

import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            args = new String[]{"src/main/tests/helloworld.pas"};
        }

        //System.out.println("parsing: " + args[0]);

        InterpreterLexer lexer = new InterpreterLexer(new ANTLRFileStream(args[0]));
        InterpreterParser parser = new InterpreterParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        InterpreterVisitor visitor = new CustomVisitor();
        visitor.visit(tree);
    }
}