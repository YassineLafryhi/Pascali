package com.pascali;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("pascali: error: no input files");
            System.exit(1);
        }
        Lexer lexer = new Lexer(new ANTLRFileStream(args[0]));
        Parser parser = new Parser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
