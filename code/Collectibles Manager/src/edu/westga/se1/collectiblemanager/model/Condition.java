package edu.westga.se1.collectiblemanager.model;

/**
 * Enum for a collectible's condition.
 * 
 * @author Michael Lee & Rachel Eckleberry
 * @version Fall 2022
 */
public enum Condition {
	
	BRAND_NEW("Brand New"),
	GOOD_CONDITION("Good Condition"),
	ACCEPTABLE("Acceptable"),
	USED("Used");
	
	private String description;
	
	Condition(String description){
		this.description = description;
	}
	
	@Override
	public String toString() {
		return this.description;
	}
}
