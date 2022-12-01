package edu.westga.se1.collectiblemanager.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Group class.
 * 
 * @author Michael Lee & Rachel Eckleberry
 * @version Fall 2022
 */
public class Group {

	private String name;
	private List<Collectible> collectibles;

	/**
	 * Constructor for group object
	 * 
	 * @precondition name != null && !name.isEmpty
	 * @postcondition none
	 * 
	 * @param name the name of the group
	 */
	public Group(String name) {
		if (name == null) {
			throw new IllegalArgumentException("The group name cannot be null.");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("The group name cannot be empty.");
		}

		this.name = name;
		this.collectibles = new ArrayList<Collectible>();
	}

	/**
	 * Gets the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the collectibles
	 * 
	 * @return the list of collectibles
	 */
	public List<Collectible> getCollectibles() {
		return this.collectibles;
	}

	/**
	 * Adds a collectible to the group.
	 * 
	 * @precondition collectible != null
	 * @postcondition the collectible is added
	 * 
	 * @param collectible the collectible to add
	 * @return true if the collectible was added, false otherwise
	 */
	public boolean addCollectible(Collectible collectible) {
		if (collectible == null) {
			throw new IllegalArgumentException("The collectible cannot be null.");
		}

		int groupSize = this.collectibles.size();
		this.collectibles.add(collectible);

		if (this.collectibles.size() == groupSize + 1) {
			return true;
		}
		return false;
	}

	/**
	 * Removes a collectible from the group at the specified index.
	 * 
	 * @precondition this.collectibles.size > index >= 0
	 * @postcondition the collectible is removed
	 * 
	 * @param index the index of the collectible to remove
	 * @return true if the collectible was removed, false otherwise
	 */
	public boolean removeCollectible(int index) {
		if (index < 0 || index >= this.collectibles.size()) {
			throw new IllegalArgumentException("The index must be within the bounds of the group's collection.");
		}

		int groupSize = this.collectibles.size();
		this.collectibles.remove(index);

		if (this.collectibles.size() == groupSize - 1) {
			return true;
		}
		return false;
	}
}
