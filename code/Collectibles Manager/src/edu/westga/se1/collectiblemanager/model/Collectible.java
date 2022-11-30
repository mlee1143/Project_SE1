package edu.westga.se1.collectiblemanager.model;

public class Collectible {
	private String name;
	private int year;
	private double price;
	private String descritpion;
	private Condition condition;
	
	///--module-path "${eclipse_home}/javafx-sdk-18.0.2/lib" --add-modules
	///javafx.controls,javafx.fxml
	
	/**
	 * Constructor for Collectible object
	 * 
	 * @precondition name != null && !name.isEmpty() && quantity > 0
	 * @param name the name of the collectible
	 * @param quantity
	 */
	public Collectible(String name, int year, double price, String description, Condition condition) {
		if (name == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		
		this.name = name;
		this.year = year;
		this.price = price;
		this.descritpion = description;
		this.condition = condition;
	}
	
	
	/**
	 * Gets the name of the collectible
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return gets the name of the collectible
	 */
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescritpion() {
		return descritpion;
	}

	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		String output = this.name + ": " + this.price + " , " + this.condition;
		return output;
	}


}
