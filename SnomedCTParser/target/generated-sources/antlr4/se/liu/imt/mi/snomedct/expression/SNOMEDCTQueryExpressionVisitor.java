// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTQueryExpression.g4 by ANTLR 4.5.3
package se.liu.imt.mi.snomedct.expression;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SNOMEDCTQueryExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SNOMEDCTQueryExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#unaryConstraintOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryConstraintOp(SNOMEDCTQueryExpressionParser.UnaryConstraintOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#binaryConstraintOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryConstraintOp(SNOMEDCTQueryExpressionParser.BinaryConstraintOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SNOMEDCTQueryExpressionParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#subQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQuery(SNOMEDCTQueryExpressionParser.SubQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SNOMEDCTQueryExpressionParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SNOMEDCTQueryExpressionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SNOMEDCTQueryExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#definitionStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionStatus(SNOMEDCTQueryExpressionParser.DefinitionStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(SNOMEDCTQueryExpressionParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#focusConcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFocusConcept(SNOMEDCTQueryExpressionParser.FocusConceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#conceptReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptReference(SNOMEDCTQueryExpressionParser.ConceptReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#refinement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinement(SNOMEDCTQueryExpressionParser.RefinementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#attributeGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeGroup(SNOMEDCTQueryExpressionParser.AttributeGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#nonGroupedAttributeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonGroupedAttributeSet(SNOMEDCTQueryExpressionParser.NonGroupedAttributeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#attributeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSet(SNOMEDCTQueryExpressionParser.AttributeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SNOMEDCTQueryExpressionParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(SNOMEDCTQueryExpressionParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionParser#nestedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpression(SNOMEDCTQueryExpressionParser.NestedExpressionContext ctx);
}