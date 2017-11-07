// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTExpression.g4 by ANTLR 4.5.3
package se.liu.imt.mi.snomedct.expression;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SNOMEDCTExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SNOMEDCTExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SNOMEDCTExpressionParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SNOMEDCTExpressionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SNOMEDCTExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#definitionStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionStatus(SNOMEDCTExpressionParser.DefinitionStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(SNOMEDCTExpressionParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#focusConcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFocusConcept(SNOMEDCTExpressionParser.FocusConceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#conceptReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptReference(SNOMEDCTExpressionParser.ConceptReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#refinement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinement(SNOMEDCTExpressionParser.RefinementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#attributeGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeGroup(SNOMEDCTExpressionParser.AttributeGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#nonGroupedAttributeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonGroupedAttributeSet(SNOMEDCTExpressionParser.NonGroupedAttributeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#attributeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSet(SNOMEDCTExpressionParser.AttributeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SNOMEDCTExpressionParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(SNOMEDCTExpressionParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTExpressionParser#nestedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpression(SNOMEDCTExpressionParser.NestedExpressionContext ctx);
}