/**
 * 
 */
package se.liu.imt.mi.snomedct.expressionrepository.datatypes;

/**
 * @author Medhanie Weldemariam, medwe277@student.liu.se
 * 
 * 
 */

public class ConceptId extends Object {
//same like expressionid
	
	/**
	 * @param id
	 */
	public ConceptId(Long id) 
	{
		super();
		this.internalConceptId = id;
	}

	/**
	 * 
	 */
	private Long internalConceptId = null;

	public Long getId() 
	{
		return internalConceptId;
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
		result = prime
				* result
				+ ((internalConceptId == null) ? 0 : internalConceptId
						.hashCode());
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
		ConceptId other = (ConceptId) obj;
		if (internalConceptId == null) {
			if (other.internalConceptId != null)
				return false;
		} else if (internalConceptId != other.internalConceptId)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return internalConceptId.toString();
	}
	
	
}
