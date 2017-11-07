package se.liu.imt.mi.snomedct.expressionrepository.datatypes;

/**
 * @author Medhanie Weldemariam, medwe277@student.liu.se
 * 
 * 
 */

public class TargetComponentId  extends Object
{
	/**
	 * @param id
	 */
	public TargetComponentId(Long id) 
	{
		super();
		this.internalTargetComponentId = id;
	}

	/**
	 * 
	 */
	private Long internalTargetComponentId = null;
	//public Object internalTargetComponentId;

	public Long getId() 
	{
		return internalTargetComponentId;
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
				+ ((internalTargetComponentId == null) ? 0 : internalTargetComponentId
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
		TargetComponentId other = (TargetComponentId) obj;
		if (internalTargetComponentId == null) {
			if (other.internalTargetComponentId != null)
				return false;
		} else if (internalTargetComponentId != other.internalTargetComponentId)
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
		return internalTargetComponentId.toString();
	}
}
