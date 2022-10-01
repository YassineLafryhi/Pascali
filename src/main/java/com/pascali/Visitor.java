package com.pascali;// Generated from pascal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(Parser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#usesUnitsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesUnitsPart(Parser.UsesUnitsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclarationPart(Parser.LabelDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(Parser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(Parser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(Parser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constantChr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantChr(Parser.ConstantChrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(Parser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(Parser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(Parser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(Parser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(Parser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(Parser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Parser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(Parser.TypeDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(Parser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(Parser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#procedureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureType(Parser.ProcedureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(Parser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(Parser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(Parser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(Parser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(Parser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(Parser.UnpackedStructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#stringtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringtype(Parser.StringtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Parser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(Parser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(Parser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(Parser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(Parser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(Parser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(Parser.FixedPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(Parser.RecordSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variantPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantPart(Parser.VariantPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(Parser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(Parser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(Parser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(Parser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(Parser.FileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(Parser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(Parser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(Parser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(Parser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(Parser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Parser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(Parser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(Parser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(Parser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(Parser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(Parser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(Parser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(Parser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(Parser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(Parser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(Parser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(Parser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(Parser.MultiplicativeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(Parser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(Parser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(Parser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(Parser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(Parser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(Parser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(Parser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(Parser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(Parser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#parameterwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterwidth(Parser.ParameterwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(Parser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(Parser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(Parser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(Parser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(Parser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(Parser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(Parser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(Parser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(Parser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(Parser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(Parser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(Parser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#recordVariableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariableList(Parser.RecordVariableListContext ctx);
}
