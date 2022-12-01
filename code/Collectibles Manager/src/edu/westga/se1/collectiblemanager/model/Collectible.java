package edu.westga.se1.collectiblemanager.model;

/**
 * The Collectible class.
 * 
 * @author Michael Lee & Rachel Eckleberry
 * @version Fall 2022
 */
public class Collectible {
	private String name;
	private int year;
	private double price;
	private String description;
	private Condition condition;
	private static final String COMMA = ", ";

//	--module-path "${eclipse_home}/javafx-sdk-18.0.2/lib" --add-modules
//	javafx.controls,javafx.fxml

	/**
	 * Constructor for Collectible object
	 * 
	 * @precondition name != null && !name.isEmpty() && quantity > 0
	 * @param name        the name of the collectible
	 * @param price       the price
	 * @param year        the year
	 * @param description the description
	 * @param condition   the condition
	 */
	public Collectible(String name, double price, int year, String description, Condition condition) {
		if (name == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("name cannot be empty");
		}

		this.name = name;
		this.year = year;
		this.price = price;
		this.description = description;
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
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescritpion() {
		return this.description;
	}

	public void setDescritpion(String descritpion) {
		this.description = descritpion;
	}

	public Condition getCondition() {
		return this.condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		String output = this.name + ": " + this.year + COMMA + this.price + COMMA + this.condition + COMMA
				+ this.description;
		return output;
	}

}
