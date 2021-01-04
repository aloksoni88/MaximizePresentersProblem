/**
 * 
 */
package com.alok;

/**
 * @author Alok Soni
 *
 */
class Presentation {
	private String presentationName;
	private Integer noOfHours;
	private Integer presentationCost;
	
	

	public Presentation(String presentationName, Integer noOfHours, Integer presentationCost) {		
		this.presentationName = presentationName;
		this.noOfHours = noOfHours;
		this.presentationCost = presentationCost;
	}

	/**
	 * @return the presentationName
	 */
	public String getPresentationName() {
		return presentationName;
	}

	/**
	 * @param presentationName the presentationName to set
	 */
	public void setPresentationName(String presentationName) {
		this.presentationName = presentationName;
	}

	/**
	 * @return the noOfHours
	 */
	public Integer getNoOfHours() {
		return noOfHours;
	}

	/**
	 * @param noOfHours the noOfHours to set
	 */
	public void setNoOfHours(Integer noOfHours) {
		this.noOfHours = noOfHours;
	}

	/**
	 * @return the presentationCost
	 */
	public Integer getPresentationCost() {
		return presentationCost;
	}

	/**
	 * @param presentationCost the presentationCost to set
	 */
	public void setPresentationCost(Integer presentationCost) {
		this.presentationCost = presentationCost;
	}

	@Override
	public String toString() {
		return presentationName + "	" + noOfHours + "	" + "$" + presentationCost + "\n";
	}

}
