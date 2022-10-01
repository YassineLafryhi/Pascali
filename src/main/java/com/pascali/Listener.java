package com.pascali;// Generated from pascal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(Parser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(Parser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void enterUsesUnitsPart(Parser.UsesUnitsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void exitUsesUnitsPart(Parser.UsesUnitsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(Parser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(Parser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(Parser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(Parser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(Parser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(Parser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(Parser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(Parser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(Parser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(Parser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(Parser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(Parser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(Parser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(Parser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(Parser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(Parser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(Parser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(Parser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(Parser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(Parser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(Parser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(Parser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(Parser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(Parser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(Parser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(Parser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(Parser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(Parser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(Parser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(Parser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(Parser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(Parser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(Parser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(Parser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(Parser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(Parser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(Parser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(Parser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(Parser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(Parser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(Parser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(Parser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(Parser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(Parser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(Parser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(Parser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(Parser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(Parser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(Parser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(Parser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(Parser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(Parser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(Parser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(Parser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(Parser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(Parser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(Parser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(Parser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(Parser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(Parser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(Parser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(Parser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(Parser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(Parser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(Parser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(Parser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(Parser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(Parser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(Parser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(Parser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(Parser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(Parser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(Parser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(Parser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(Parser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(Parser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(Parser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(Parser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(Parser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(Parser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(Parser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(Parser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(Parser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(Parser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(Parser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(Parser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(Parser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(Parser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(Parser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(Parser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(Parser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(Parser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(Parser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(Parser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(Parser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(Parser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(Parser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(Parser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(Parser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(Parser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(Parser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(Parser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(Parser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(Parser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(Parser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(Parser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(Parser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(Parser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(Parser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(Parser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(Parser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(Parser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(Parser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(Parser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(Parser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(Parser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(Parser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(Parser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(Parser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(Parser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(Parser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(Parser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(Parser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(Parser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(Parser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(Parser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(Parser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(Parser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(Parser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(Parser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(Parser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(Parser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(Parser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(Parser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(Parser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(Parser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(Parser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(Parser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(Parser.RecordVariableListContext ctx);
}
