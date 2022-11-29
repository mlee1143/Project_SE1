package edu.westga.se1.collectiblemanager.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Lee
 *
 */
public class Group {
	private String name;
	private List<Collectible> collectibles;
	
	/**
	 * Constructor for group object
	 * @param name the name of the group
	 */
	public Group(String name) {
		this.name = name;
		this.collectibles = new ArrayList<Collectible>();
	}

	/**
	 * Gets the name
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the collectibles
	 * @return the list of collectibles
	 */
	public List<Collectible> getCollectibles() {
		return this.collectibles;
	}

}
