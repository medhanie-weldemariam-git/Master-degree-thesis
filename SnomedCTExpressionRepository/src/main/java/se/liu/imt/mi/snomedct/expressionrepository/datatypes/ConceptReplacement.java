package se.liu.imt.mi.snomedct.expressionrepository.datatypes;
/**
 * @author Medhanie Weldemariam, medwe277@student.liu.se
 * 
 * 
 */

public class ConceptReplacement 
{

	/**
	 *@param The concept id
	 */
	private ConceptId inactiveconceptId;

	/**
	 * The expression.
	 */
	private TargetComponentId targetComponentId;

	/**
	 * Constructor for the class.
	 * 
	 * @param expressionId
	 *            The expression id to set.
	 * @param expression
	 *            The expression to set.
	 */
	public ConceptReplacement(ConceptId inactiveconceptId, TargetComponentId targetComponentId) {
		super();
		this.inactiveconceptId = inactiveconceptId;
		this.targetComponentId = targetComponentId;
	}

	/**
	 * Get the inactiveConceptId
	 */
	public ConceptId getinactiveConceptId() {
		return inactiveconceptId;
	}

	
	/**
	 * Get the targetComponentId
	 */
	public TargetComponentId getTargetComponentId() {
		return targetComponentId;
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
				+ ((targetComponentId == null) ? 0 : targetComponentId.hashCode());
		result = prime * result
				+ ((inactiveconceptId == null) ? 0 : inactiveconceptId.hashCode());
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
		ConceptReplacement other = (ConceptReplacement) obj;
		if (targetComponentId == null) {
			if (other.targetComponentId != null)
				return false;
		} else if (!targetComponentId.equals(other.targetComponentId))
			return false;
		if (inactiveconceptId == null) {
			if (other.inactiveconceptId != null)
				return false;
		} else if (!inactiveconceptId.equals(other.inactiveconceptId))
			return false;
		return true;
	}
	
}
