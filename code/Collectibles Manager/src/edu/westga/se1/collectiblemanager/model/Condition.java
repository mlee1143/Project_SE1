package edu.westga.se1.collectiblemanager.model;

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
