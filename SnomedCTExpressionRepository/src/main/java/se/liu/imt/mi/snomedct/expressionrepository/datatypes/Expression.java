package se.liu.imt.mi.snomedct.expressionrepository.datatypes;

/**
 * An expression containing the expressions id and actual expression.
 * 
 * 
 * @author Daniel Karlsson, daniel.karlsson@liu.se
 * @author Mikael Nyström, mikael.nystrom@liu.se
 * 
 */

public class Expression {

	/**
	 * The expressions id
	 */
	private ExpressionId expressionId;

	/**
	 * The expression.
	 */
	private String expression;
	
	/**Author : Medhanie
	 * The isExpressionUpdated 
	 * A flag which tells weather an expression is updated or not during the update process
	 * * */
	private boolean isExpressionUpdated;

	
	/**
	 * Constructor for the class.
	 * 
	 * @param expressionId
	 *            The expression id to set.
	 * @param expression
	 *            The expression to set.
	 *            
	 */
	public Expression(ExpressionId expressionId, String expression) {
		super();
		this.expressionId = expressionId;
		this.expression = expression;
		this.isExpressionUpdated = false;
	} 
	
	/**
	 * Constructor for the class.
	 * 
	 * @param expressionId
	 *            The expression id to set.
	 * @param expression
	 *            The expression to set.
	 */
	public Expression(ExpressionId expressionId, String expression, boolean isExpressionUpdated) {
		super();
		this.expressionId = expressionId;
		this.expression = expression;
		this.isExpressionUpdated = isExpressionUpdated;
	}

	/**
	 * @return the expressionId
	 */
	public ExpressionId getExpressionId() {
		return expressionId;
	}

	/**
	 * @param expressionId
	 *            the expressionId to set
	 */
	public void setExpressionId(ExpressionId expressionId) {
		this.expressionId = expressionId;
	}

	/**
	 * @return the expression
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * @param expression
	 *            the expression to set
	 */
	public void setExpression(String expression) {
		this.expression = expression;
	}

	/**
	 * Author MEDHANIE WELDEMARIAM
	 * @return the isExpressionUpdated
	 */
	public boolean isExpressionUpdated() {
		return isExpressionUpdated;
	}

	/**
	 * Author MEDHANIE WELDEMARIAM
	 * @param isExpressionUpdated the isExpressionUpdated to set
	 */
	public void setExpressionUpdated(boolean isExpressionUpdated) {
		this.isExpressionUpdated = isExpressionUpdated;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return expressionId + ", " + expression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((expression == null) ? 0 : expression.hashCode());
		result = prime * result
				+ ((expressionId == null) ? 0 : expressionId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expression other = (Expression) obj;
		if (expression == null) {
			if (other.expression != null)
				return false;
		} else if (!expression.equals(other.expression))
			return false;
		if (expressionId == null) {
			if (other.expressionId != null)
				return false;
		} else if (!expressionId.equals(other.expressionId))
			return false;
		return true;
	}

}
