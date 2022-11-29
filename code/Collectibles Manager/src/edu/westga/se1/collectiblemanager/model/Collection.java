package edu.westga.se1.collectiblemanager.model;

import java.util.ArrayList;
import java.util.List;

public class Collection {
private List<Collectible> collectibles;
	
	/**
	 * Constructor for a Collectible manager object
	 */
	public Collection() {
		this.collectibles = new ArrayList<Collectible>();
	}
	
	/**
	 * Gets the size of the list
	 * 
	 * @return gets the size of the list.
	 */
	public int getSize() {
		return this.collectibles.size();
	}
	
	/**
	 * Adds a collectible to list
	 * 
	 * @precondition item != null
	 * @postcondition getSize() = @prev + 1
	 * @param item the item to be added
	 * @return true if item was add, false otherwise.
	 */
	public boolean add(Collectible item) {
		if (item == null) {
			throw new IllegalArgumentException("item cannot be null");
		}
		if (this.collectibles.add(item)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Check if list contains collectible
	 * 
	 * @param obj the collectible to check
	 * @return true if list contains collectible, false otherwise
	 */
	public boolean contains(Object obj) {
		return this.collectibles.contains(obj);
	}
	
}
