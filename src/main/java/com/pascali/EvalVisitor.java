package com.pascali;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvalVisitor extends BaseVisitor<Value> {

    private Map<String, Value> memory = new HashMap<String, Value>();

    private Map<String, Object> procedures = new HashMap<>();
    private boolean visitingAProcedureNow = true;
    ParseTree mainBlock;

    @Override
    public Value visitProgram(Parser.ProgramContext ctx) {
        //System.out.println("I just visited program " + ctx.getText() + " " + ctx.parent + " " + ctx.start);
        mainBlock = ctx.block().compoundStatement();
        return super.visitProgram(ctx);
    }

    @Override
    public Value visitProgramHeading(Parser.ProgramHeadingContext ctx) {
        //System.out.println("I just visited programHeading " + ctx.getText() + " " + ctx.identifier() + " " + ctx.start);
        return super.visitProgramHeading(ctx);
    }

    @Override
    public Value visitIdentifier(Parser.IdentifierContext ctx) {
        if (memory.containsKey(ctx.IDENT().getText())) {
            return new Value(memory.get(ctx.IDENT().getText()).asInteger(), ctx.IDENT().getText());
        }
        return super.visitIdentifier(ctx);
    }

    @Override
    public Value visitBlock(Parser.BlockContext ctx) {
        //System.out.println("I just visited block " + ctx.getText());
        return super.visitBlock(ctx);
    }

    @Override
    public Value visitUsesUnitsPart(Parser.UsesUnitsPartContext ctx) {
        return super.visitUsesUnitsPart(ctx);
    }

    @Override
    public Value visitLabelDeclarationPart(Parser.LabelDeclarationPartContext ctx) {
        return super.visitLabelDeclarationPart(ctx);
    }

    @Override
    public Value visitLabel(Parser.LabelContext ctx) {
        //System.out.println("I just visited label" + ctx.getText());
        return super.visitLabel(ctx);
    }

    @Override
    public Value visitConstantDefinitionPart(Parser.ConstantDefinitionPartContext ctx) {
        return super.visitConstantDefinitionPart(ctx);
    }

    @Override
    public Value visitConstantDefinition(Parser.ConstantDefinitionContext ctx) {
        return super.visitConstantDefinition(ctx);
    }

    @Override
    public Value visitConstantChr(Parser.ConstantChrContext ctx) {
        return super.visitConstantChr(ctx);
    }

    @Override
    public Value visitConstant(Parser.ConstantContext ctx) {
        return super.visitConstant(ctx);
    }

    @Override
    public Value visitUnsignedNumber(Parser.UnsignedNumberContext ctx) {
        //System.out.println("I just visited UnsignedNumber" + ctx.getText());
        return super.visitUnsignedNumber(ctx);
    }

    @Override
    public Value visitUnsignedInteger(Parser.UnsignedIntegerContext ctx) {
        //System.out.println("I just visited UnsignedInteger" + ctx.getText());
        return new Value(Integer.valueOf(ctx.getText()));
    }

    @Override
    public Value visitUnsignedReal(Parser.UnsignedRealContext ctx) {
        return super.visitUnsignedReal(ctx);
    }

    @Override
    public Value visitSign(Parser.SignContext ctx) {
        //System.out.println("I just visited Sign" + ctx.getText());
        return super.visitSign(ctx);
    }

    @Override
    public Value visitBool(Parser.BoolContext ctx) {
        //System.out.println(ctx.getText());
        return new Value(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Value visitString(Parser.StringContext ctx) {
        //System.out.println("I just visited String" + ctx.getText());
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("'", "");
        return new Value(str);
    }

    @Override
    public Value visitTypeDefinitionPart(Parser.TypeDefinitionPartContext ctx) {
        return super.visitTypeDefinitionPart(ctx);
    }

    @Override
    public Value visitTypeDefinition(Parser.TypeDefinitionContext ctx) {
        //System.out.println("I just visited Type Definition " + ctx.parent.getText());
        return super.visitTypeDefinition(ctx);
    }

    @Override
    public Value visitFunctionType(Parser.FunctionTypeContext ctx) {
        return super.visitFunctionType(ctx);
    }

    @Override
    public Value visitProcedureType(Parser.ProcedureTypeContext ctx) {
        //System.out.println("I have visited visitProcedureType" + ctx.getText());
        return super.visitProcedureType(ctx);
    }

    @Override
    public Value visitType(Parser.TypeContext ctx) {
        //System.out.println("I just visited Type " + ctx.getText() + " " + ctx.parent.getText());
        return super.visitType(ctx);
    }

    @Override
    public Value visitSimpleType(Parser.SimpleTypeContext ctx) {
        //System.out.println("I have visited visitSimpleType" + ctx.getText());
        return super.visitSimpleType(ctx);
    }

    @Override
    public Value visitScalarType(Parser.ScalarTypeContext ctx) {
        //System.out.println("I have visited visitScalarType" + ctx.getText());
        return super.visitScalarType(ctx);
    }

    @Override
    public Value visitSubrangeType(Parser.SubrangeTypeContext ctx) {
        return super.visitSubrangeType(ctx);
    }

    @Override
    public Value visitTypeIdentifier(Parser.TypeIdentifierContext ctx) {
        //System.out.println("I have visited visitTypeIdentifier" + ctx.getText());
        return new Value(ctx.getText());
    }

    @Override
    public Value visitStructuredType(Parser.StructuredTypeContext ctx) {
        return super.visitStructuredType(ctx);
    }

    @Override
    public Value visitUnpackedStructuredType(Parser.UnpackedStructuredTypeContext ctx) {
        return super.visitUnpackedStructuredType(ctx);
    }

    @Override
    public Value visitStringtype(Parser.StringtypeContext ctx) {
        //System.out.println("I have visited visitStringtype" + ctx.getText());
        return super.visitStringtype(ctx);
    }

    @Override
    public Value visitArrayType(Parser.ArrayTypeContext ctx) {
        return super.visitArrayType(ctx);
    }

    @Override
    public Value visitTypeList(Parser.TypeListContext ctx) {
        return super.visitTypeList(ctx);
    }

    @Override
    public Value visitIndexType(Parser.IndexTypeContext ctx) {
        return super.visitIndexType(ctx);
    }

    @Override
    public Value visitComponentType(Parser.ComponentTypeContext ctx) {
        return super.visitComponentType(ctx);
    }

    @Override
    public Value visitRecordType(Parser.RecordTypeContext ctx) {
        return super.visitRecordType(ctx);
    }

    @Override
    public Value visitFieldList(Parser.FieldListContext ctx) {
        return super.visitFieldList(ctx);
    }

    @Override
    public Value visitFixedPart(Parser.FixedPartContext ctx) {
        return super.visitFixedPart(ctx);
    }

    @Override
    public Value visitRecordSection(Parser.RecordSectionContext ctx) {
        return super.visitRecordSection(ctx);
    }

    @Override
    public Value visitVariantPart(Parser.VariantPartContext ctx) {
        return super.visitVariantPart(ctx);
    }

    @Override
    public Value visitTag(Parser.TagContext ctx) {
        return super.visitTag(ctx);
    }

    @Override
    public Value visitVariant(Parser.VariantContext ctx) {
        return super.visitVariant(ctx);
    }

    @Override
    public Value visitSetType(Parser.SetTypeContext ctx) {
        return super.visitSetType(ctx);
    }

    @Override
    public Value visitBaseType(Parser.BaseTypeContext ctx) {
        return super.visitBaseType(ctx);
    }

    @Override
    public Value visitFileType(Parser.FileTypeContext ctx) {
        return super.visitFileType(ctx);
    }

    @Override
    public Value visitPointerType(Parser.PointerTypeContext ctx) {
        return super.visitPointerType(ctx);
    }

    @Override
    public Value visitVariableDeclarationPart(Parser.VariableDeclarationPartContext ctx) {
        return super.visitVariableDeclarationPart(ctx);
    }

    @Override
    public Value visitVariableDeclaration(Parser.VariableDeclarationContext ctx) {
        Value type = this.visit(ctx.type());
        switch (type.asString()) {
            case "integer":
                //System.out.println(ctx.identifierList().getText());
                String identifierList = ctx.identifierList().getText();
                for (String identifier : identifierList.split(",")) {
                    memory.put(identifier, new Value(0, identifier));
                }
                break;
        }
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public Value visitProcedureAndFunctionDeclarationPart(Parser.ProcedureAndFunctionDeclarationPartContext ctx) {
        //visitingAProcedureNow = true;
        return super.visitProcedureAndFunctionDeclarationPart(ctx);
    }

    @Override
    public Value visitProcedureOrFunctionDeclaration(Parser.ProcedureOrFunctionDeclarationContext ctx) {
        if (ctx.procedureDeclaration() != null) {
            procedures.put(ctx.procedureDeclaration().identifier().getText(), ctx);
        }
        return super.visitProcedureOrFunctionDeclaration(ctx);
    }

    @Override
    public Value visitProcedureDeclaration(Parser.ProcedureDeclarationContext ctx) {
        return super.visitProcedureDeclaration(ctx);
    }

    @Override
    public Value visitFormalParameterList(Parser.FormalParameterListContext ctx) {
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public Value visitFormalParameterSection(Parser.FormalParameterSectionContext ctx) {
        return super.visitFormalParameterSection(ctx);
    }

    @Override
    public Value visitParameterGroup(Parser.ParameterGroupContext ctx) {
        return super.visitParameterGroup(ctx);
    }

    @Override
    public Value visitIdentifierList(Parser.IdentifierListContext ctx) {
        return super.visitIdentifierList(ctx);
    }

    @Override
    public Value visitConstList(Parser.ConstListContext ctx) {
        return super.visitConstList(ctx);
    }

    @Override
    public Value visitFunctionDeclaration(Parser.FunctionDeclarationContext ctx) {
        return super.visitFunctionDeclaration(ctx);
    }

    @Override
    public Value visitResultType(Parser.ResultTypeContext ctx) {
        //System.out.println("I just visited visitResultType" + ctx.getText());
        return super.visitResultType(ctx);
    }

    @Override
    public Value visitStatement(Parser.StatementContext ctx) {
        //System.out.println("I just visited Statement" + ctx.getText());
        return super.visitStatement(ctx);
    }

    @Override
    public Value visitUnlabelledStatement(Parser.UnlabelledStatementContext ctx) {
        return super.visitUnlabelledStatement(ctx);
    }

    @Override
    public Value visitSimpleStatement(Parser.SimpleStatementContext ctx) {
        //System.out.println("I just visited Simple Statement" + ctx.getText());
        return super.visitSimpleStatement(ctx);
    }

    @Override
    public Value visitAssignmentStatement(Parser.AssignmentStatementContext ctx) {
        //System.out.println("I just visited Assignment Statement " + ctx.getChild(0).getText() + " " + ctx.expression().getText());
        String id = ctx.getChild(0).getText();
        Value value = this.visit(ctx.expression());
        return memory.put(id, value);
    }

    @Override
    public Value visitVariable(Parser.VariableContext ctx) {
        //System.out.println("I just visited Variable " + ctx.getText());
        return super.visitVariable(ctx);
    }

    @Override
    public Value visitExpression(Parser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            if (ctx.relationaloperator() != null) {
                switch (ctx.relationaloperator().getText()) {
                    case "=": {
                        Value left = this.visit(ctx.getChild(0));
                        Value right = this.visit(ctx.getChild(2));
                        return new Value(left.asInteger().equals(right.asInteger()));
                    }
                    case ">=": {
                        Value left = this.visit(ctx.getChild(0));
                        Value right = this.visit(ctx.getChild(2));
                        return new Value(left.asInteger() >= right.asInteger());
                    }
                    case "<=": {
                        Value left = this.visit(ctx.getChild(0));
                        Value right = this.visit(ctx.getChild(2));
                        return new Value(left.asInteger() <= right.asInteger());
                    }
                    case "<": {
                        Value left = this.visit(ctx.getChild(0));
                        Value right = this.visit(ctx.getChild(2));
                        return new Value(left.asInteger() < right.asInteger());
                    }
                    case ">": {
                        Value left = this.visit(ctx.getChild(0));
                        Value right = this.visit(ctx.getChild(2));
                        return new Value(left.asInteger() > right.asInteger());
                    }
                    case "<>": {
                        Value left = this.visit(ctx.getChild(0));
                        Value right = this.visit(ctx.getChild(2));
                        return new Value(!left.asInteger().equals(right.asInteger()));
                    }
                }
            }
        }
        return super.visitExpression(ctx);
    }

    @Override
    public Value visitRelationaloperator(Parser.RelationaloperatorContext ctx) {
        //System.out.println("I just visited Relational operator" + ctx.getText());
        return super.visitRelationaloperator(ctx);
    }

    @Override
    public Value visitSimpleExpression(Parser.SimpleExpressionContext ctx) {
        //System.out.println("I just visited Simple Expression yes " + ctx.getText() + " " + ctx.start.getText() + " " + ctx.getChildCount());
        //System.out.println(ctx.getText() + " " + ctx.getChildCount());
        //for (ParseTree parseTree : ctx.children)
        //System.out.print(parseTree.getText() + "@");
        //System.out.println();
        //System.out.println(ctx.additiveoperator()==null?"null":ctx.additiveoperator().getText());
        if (ctx.additiveoperator() != null) {
            Value left = this.visit(ctx.getChild(0));
            Value right = this.visit(ctx.getChild(2));


            if (ctx.getText().contains("+")) {
                Value value = new Value(left.asInteger() + right.asInteger());
                //System.out.println(value);
                return value;
            } else if (ctx.getText().contains("-")) {
                Value value = new Value(left.asInteger() - right.asInteger());
                return value;
            }

        }
        return super.visitSimpleExpression(ctx);
/*
        if (ctx.getChildCount() == 3) {
            Value left = this.visit(ctx.getChild(0));
            Value right = this.visit(ctx.getChild(2));
            if (ctx.getChild(0) instanceof Parser.TermContext && (ctx.getChild(2) instanceof Parser.TermContext || ctx.getChild(0).getChild(0) instanceof Parser.TermContext)) {
                if (ctx.getText().contains("+")) {
                    Value value = new Value(left.asInteger() + right.asInteger());
                    //System.out.println(value);
                    return value;
                } else if (ctx.getText().contains("-")) {
                    Value value = new Value(left.asInteger() - right.asInteger());
                    return value;
                }
            }
        } else if (ctx.getChildCount() == 1 && memory.containsKey(ctx.getText())) {
            String id = ctx.getText();
            Value value = memory.get(id);
            if (value == null) {
                throw new RuntimeException("no such variable: " + id);
            }
            return value;
        }*/

    }

    @Override
    public Value visitAdditiveoperator(Parser.AdditiveoperatorContext ctx) {
        //System.out.println("I just visited Additive operator" + ctx.getText() + " " + ctx.parent.getChildCount());
        /*if (ctx.parent.getChildCount() == 3) {
            return new Value(Integer.parseInt(this.visit(ctx.parent.getChild(0))) + Integer.parseInt(this.visit()ctx.parent.getChild(2)));
        }*/
        /*switch (ctx.getText()) {
            case "+":
                System.out.println("+");
                break;
            case "-":
                System.out.println("-");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ctx.getText());
        }*/
        return super.visitAdditiveoperator(ctx);
    }

    @Override
    public Value visitTerm(Parser.TermContext ctx) {
        if (ctx.getChildCount() == 3) {
            if (ctx.multiplicativeoperator() != null) {
                if (ctx.multiplicativeoperator().MOD() != null) {
                    Value left = this.visit(ctx.getChild(0));
                    Value right = this.visit(ctx.getChild(2));
                    return new Value(left.asInteger() % right.asInteger());
                } else if (ctx.multiplicativeoperator().DIV() != null) {
                    Value left = this.visit(ctx.getChild(0));
                    Value right = this.visit(ctx.getChild(2));
                    return new Value(left.asInteger() / right.asInteger());
                } else if (ctx.multiplicativeoperator().AND() != null) {
                    Value left = this.visit(ctx.getChild(0));
                    Value right = this.visit(ctx.getChild(2));
                    return new Value(left.asBoolean() && right.asBoolean());
                } else if (ctx.multiplicativeoperator().STAR() != null) {
                    Value left = this.visit(ctx.getChild(0));
                    Value right = this.visit(ctx.getChild(2));
                    return new Value(left.asInteger() * right.asInteger());
                }
            }
        }
        return super.visitTerm(ctx);
    }

    @Override
    public Value visitMultiplicativeoperator(Parser.MultiplicativeoperatorContext ctx) {
        //System.out.println("I just visited Multiplicativeoperator" + ctx.getText());
        return super.visitMultiplicativeoperator(ctx);
    }

    @Override
    public Value visitSignedFactor(Parser.SignedFactorContext ctx) {
        //System.out.println("I just visit SignedFactor" + ctx.getText());
        if (ctx.MINUS() != null) {
            int number = this.visit(ctx.factor()).asInteger();
            return new Value(-number);
        }
        return super.visitSignedFactor(ctx);
    }

    @Override
    public Value visitFactor(Parser.FactorContext ctx) {
        //System.out.println("I just visit Factor" + ctx.getText());
        return super.visitFactor(ctx);
    }

    @Override
    public Value visitUnsignedConstant(Parser.UnsignedConstantContext ctx) {
        //System.out.println("I just visitUnsignedConstant" + ctx.getText());
        return super.visitUnsignedConstant(ctx);
    }

    @Override
    public Value visitFunctionDesignator(Parser.FunctionDesignatorContext ctx) {
        return super.visitFunctionDesignator(ctx);
    }

    @Override
    public Value visitParameterList(Parser.ParameterListContext ctx) {
        /*System.out.println(this.visit(ctx.actualParameter(0).expression()));
        System.out.println(this.visit(ctx.actualParameter(1).expression()));
        for(ParseTree parseTree:ctx.children){
            System.out.print(parseTree.getText()+"+");
        }*/
        String string = "";
        for (Parser.ActualParameterContext actual : ctx.actualParameter()) {
            Value value = this.visit(actual.expression());
            if (value != null)
                string = string.concat(value.asString());
        }
        return new Value(string);
        //return super.visitParameterList(ctx);
    }

    @Override
    public Value visitSet(Parser.SetContext ctx) {
        //System.out.println("I just visited visitSet" + ctx.getText());
        return super.visitSet(ctx);
    }

    @Override
    public Value visitElementList(Parser.ElementListContext ctx) {
        //System.out.println("I just visited ElementList" + ctx.getText());
        return super.visitElementList(ctx);
    }

    @Override
    public Value visitElement(Parser.ElementContext ctx) {
        //System.out.println("I just visited Element" + ctx.getText());
        return super.visitElement(ctx);
    }

    @Override
    public Value visitProcedureStatement(Parser.ProcedureStatementContext ctx) {
        //System.out.println("I just visited Procedure Statement" + ctx.getText());
        switch (ctx.identifier().getText()) {
            case "writeln": {
                if (ctx.parameterList() != null) {
                    for (Parser.ActualParameterContext actual : ctx.parameterList().actualParameter()) {
                        Value value = this.visit(actual);
                        System.out.print(value);
                    }
                    System.out.println();
                } else {
                    System.out.println();
                }
                return Value.VOID;
            }
            case "write": {
                Value value = this.visit(ctx.parameterList());
                System.out.print(value);
                return value;
            }
            case "readln": {
                if (ctx.parameterList() != null) {
                    for (Parser.ActualParameterContext actual : ctx.parameterList().actualParameter()) {
                        Value value = this.visit(actual);
                        int number = Integer.parseInt(new Scanner(System.in).nextLine());
                        memory.put(value.getIdentifier(), new Value(number, value.getIdentifier()));
                    }
                } else {
                    new Scanner(System.in).nextLine();
                }
                return Value.VOID;
            }
            default:
                //System.out.println(visitingAProcedureNow);
                if (!visitingAProcedureNow)
                    if (procedures.containsKey(ctx.identifier().getText())) {
                        this.visit((ParseTree) procedures.get(ctx.identifier().getText()));
                    }
        }
        return super.visitProcedureStatement(ctx);
    }

    @Override
    public Value visitActualParameter(Parser.ActualParameterContext ctx) {
        //System.out.println("I just visited ActualParameter" + ctx.getText());
        /*switch (ctx.parent.parent.getChild(0).getText()) {
            case "writeln":
                Value value = this.visit(ctx.expression());
                System.out.println(value);
                return value;
            case "readln":
                int number = Integer.parseInt(new Scanner(System.in).nextLine());
                return memory.put(ctx.getText(), new Value(number));
        }*/
        return super.visitActualParameter(ctx);
    }

    @Override
    public Value visitParameterwidth(Parser.ParameterwidthContext ctx) {
        //System.out.println("I just visited Parameterwidth" + ctx.getText());
        return super.visitParameterwidth(ctx);
    }

    @Override
    public Value visitGotoStatement(Parser.GotoStatementContext ctx) {
        return super.visitGotoStatement(ctx);
    }

    @Override
    public Value visitEmptyStatement(Parser.EmptyStatementContext ctx) {
        //System.out.println("I just visited Empty Statement" + ctx.getText());
        return super.visitEmptyStatement(ctx);
    }

    @Override
    public Value visitEmpty(Parser.EmptyContext ctx) {
        //System.out.println("I just visited Empty" + ctx.getText());
        return super.visitEmpty(ctx);
    }

    @Override
    public Value visitStructuredStatement(Parser.StructuredStatementContext ctx) {
        //System.out.println("I just visit StructuredStatement" + ctx.getText());
        return super.visitStructuredStatement(ctx);
    }

    @Override
    public Value visitCompoundStatement(Parser.CompoundStatementContext ctx) {
        //System.out.println("I just visit CompoundStatement" + ctx.getText());
        return super.visitCompoundStatement(ctx);
    }

    @Override
    public Value visitStatements(Parser.StatementsContext ctx) {
        //System.out.println("I just visitStatements" + ctx.getText());
        return super.visitStatements(ctx);
    }

    @Override
    public Value visitConditionalStatement(Parser.ConditionalStatementContext ctx) {
        return super.visitConditionalStatement(ctx);
    }

    @Override
    public Value visitIfStatement(Parser.IfStatementContext ctx) {
        Value evaluated = this.visit(ctx.expression());
        if (evaluated.asBoolean()) {
            this.visit(ctx.statement(0));
        }
        if (ctx.ELSE() != null) {
            if (!evaluated.asBoolean()) {
                this.visit(ctx.statement(1));
            }
        }

        return Value.VOID;
    }

    @Override
    public Value visitCaseStatement(Parser.CaseStatementContext ctx) {
       /*
        Value left = this.visit(ctx.expression());
        for (Parser.CaseListElementContext caseList : ctx.caseListElement()) {
            //TODO: ERROR !
            for (ParseTree child : caseList.getChild(0).children) {
                Value right = this.visit(child);
                if (left.asInteger().equals(right.asInteger())) {
                    this.visit(caseList.statement());
                }
            }
        }
        */
        return super.visitCaseStatement(ctx);
    }

    @Override
    public Value visitCaseListElement(Parser.CaseListElementContext ctx) {
        return super.visitCaseListElement(ctx);
    }

    @Override
    public Value visitRepetetiveStatement(Parser.RepetetiveStatementContext ctx) {
        return super.visitRepetetiveStatement(ctx);
    }

    @Override
    public Value visitWhileStatement(Parser.WhileStatementContext ctx) {
        while (this.visit(ctx.expression()).asBoolean()) {
            this.visit(ctx.statement());
        }
        return Value.VOID;
    }

    @Override
    public Value visitRepeatStatement(Parser.RepeatStatementContext ctx) {
        do {
            for (Parser.StatementContext statement : ctx.statements().statement())
                this.visit(statement);
        }
        while (!this.visit(ctx.expression()).asBoolean());
        return Value.VOID;
    }

    @Override
    public Value visitForStatement(Parser.ForStatementContext ctx) {
        //System.out.println("I am here !");
        int initialValue = this.visit(ctx.forList().initialValue()).asInteger();
        int finalValue = this.visit(ctx.forList().finalValue()).asInteger();
        memory.put(ctx.identifier().getText(), new Value(initialValue));
        for (; memory.get(ctx.identifier().getText()).asInteger() <= finalValue; ) {
            this.visit(ctx.statement());
            memory.put(ctx.identifier().getText(), new Value(memory.get(ctx.identifier().getText()).asInteger() + 1));
        }
        return Value.VOID;
    }

    @Override
    public Value visitForList(Parser.ForListContext ctx) {
        return super.visitForList(ctx);
    }

    @Override
    public Value visitInitialValue(Parser.InitialValueContext ctx) {
        //System.out.println("I just visited Initial Value" + ctx.getText());
        return super.visitInitialValue(ctx);
    }

    @Override
    public Value visitFinalValue(Parser.FinalValueContext ctx) {
        //System.out.println("I just visited Final Value" + ctx.getText());
        return super.visitFinalValue(ctx);
    }

    @Override
    public Value visitWithStatement(Parser.WithStatementContext ctx) {
        return super.visitWithStatement(ctx);
    }

    @Override
    public Value visitRecordVariableList(Parser.RecordVariableListContext ctx) {
        return super.visitRecordVariableList(ctx);
    }

    @Override
    public Value visit(ParseTree tree) {
        if (tree == mainBlock) {
            visitingAProcedureNow = false;
        }
        return super.visit(tree);
    }

    @Override
    public Value visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Value visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Value visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Value defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Value aggregateResult(Value aggregate, Value nextResult) {
        //System.out.println(nextResult);
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Value currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }
}
