// Generated from se/liu/imt/mi/snomedct/expression/SNOMEDCTQueryExpressionOld.g4 by ANTLR 4.5.3
package se.liu.imt.mi.snomedct.expression;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SNOMEDCTQueryExpressionOldParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SNOMEDCTQueryExpressionOldVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SNOMEDCTQueryExpressionOldParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#querySet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySet(SNOMEDCTQueryExpressionOldParser.QuerySetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SNOMEDCTQueryExpressionOldParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SNOMEDCTQueryExpressionOldParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SNOMEDCTQueryExpressionOldParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#definitionStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionStatus(SNOMEDCTQueryExpressionOldParser.DefinitionStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(SNOMEDCTQueryExpressionOldParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#focusConcept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFocusConcept(SNOMEDCTQueryExpressionOldParser.FocusConceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#conceptReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceptReference(SNOMEDCTQueryExpressionOldParser.ConceptReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#refinement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefinement(SNOMEDCTQueryExpressionOldParser.RefinementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#attributeGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeGroup(SNOMEDCTQueryExpressionOldParser.AttributeGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#nonGroupedAttributeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonGroupedAttributeSet(SNOMEDCTQueryExpressionOldParser.NonGroupedAttributeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#attributeSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSet(SNOMEDCTQueryExpressionOldParser.AttributeSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SNOMEDCTQueryExpressionOldParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(SNOMEDCTQueryExpressionOldParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SNOMEDCTQueryExpressionOldParser#nestedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpression(SNOMEDCTQueryExpressionOldParser.NestedExpressionContext ctx);
}