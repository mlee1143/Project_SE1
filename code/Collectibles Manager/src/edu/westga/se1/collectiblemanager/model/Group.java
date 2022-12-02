package edu.westga.se1.collectiblemanager.model;

/**
 * The Group class.
 * 
 * @author Michael Lee & Rachel Eckleberry
 * @version Fall 2022
 */
public class Group {

	private String name;
	private Collection collectibles;

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
		this.collectibles = new Collection();
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
	public Collection getCollectibles() {
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
		return this.collectibles.add(collectible);
	}

	/**
	 * Removes a collectible from the group.
	 * 
	 * @precondition collectible != null
	 * @postcondition the collectible is removed
	 * 
	 * @param collectible the collectible to remove
	 * @return true if the collectible was removed, false otherwise
	 */
	public boolean removeCollectible(Collectible collectible) {
		return this.collectibles.remove(collectible);
	}
	
	@Override
	public String toString() {
		String output = this.name + " : Size of Collection: " + this.collectibles.getSize();
		return output;
	}
}
