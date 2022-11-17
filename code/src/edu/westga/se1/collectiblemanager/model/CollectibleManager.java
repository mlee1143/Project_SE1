package edu.westga.se1.collectiblemanager.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectibleManager {
	private Map<User, List<Collectible>> database;
	
	public CollectibleManager() {
		this.database = new HashMap<User, List<Collectible>>();
	}
	
	/**
	 * Clears the HashMap
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void clear() {
		this.database.clear();
	}

	/**
	 * Gets the Value
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param key key with which the specified value is associated
	 * @return the Value associated with the key
	 */
	public List<Collectible> get(User key) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		return this.database.get(key);
	}

	/**
	 * Checks if this map contains a mapping for the specified key.
	 * 
	 * @precondition key != null
	 * @postcondition none
	 * 
	 * @param key key with which the specified value is associated
	 * @return true if it does contain key, false otherwise
	 */
	public boolean containsKey(User key) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		return this.database.containsKey(key);
	}

	/**
	 * Checks to see if the map is empty
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return true if this map contains no key-value mappings
	 */
	public boolean isEmpty() {
		return this.database.isEmpty();
	}

	/**
	 * Adds to the Map
	 * 
	 * @precondition key != null && value != null
	 * @postcondition none
	 * 
	 * @param key   key with which the specified value is associated
	 * @param value value to be associated with the specified key
	 * @return true if added, false otherwise
	 */
	public boolean add(User key, List<Collectible>value) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		if (value == null) {
			throw new IllegalArgumentException("Value cannot be null");
		}
		if (!this.database.containsKey(key)) {
			this.database.put(key, value);
			return true;
		}
		return false;
	}

	/**
	 * Updates
	 * 
	 * @precondition key != null && value != null
	 * @postcondition none
	 * 
	 * @param key   key with which the specified value is associated
	 * @param value value to be associated with the specified key
	 */
	public void update(User key, List<Collectible>value) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		if (value == null) {
			throw new IllegalArgumentException("value cannot be null");
		}
		this.database.replace(key, value);
	}

	/**
	 * Removes
	 * 
	 * @precondition key != null
	 * @postcondition none
	 * 
	 * @param key   key with which the specified value is associated
	 * @return true if value is removed, false otherwise
	 */
	public boolean remove(User key) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		if (this.database.containsKey(key)) {
			this.database.remove(key);
			return true;
		}
		return false;
	}

	/**
	 * The number of values in the Map
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return number of values in the Map
	 */
	public int size() {
		return this.database.size();
	}

	/**
	 * Gets a collection of Values
	 * @return 
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a Collection of Values
	 */
	public Collection<List<Collectible>> values() {
		return this.database.values();
	}

	/**
	 * Gets a collection of keys
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a Collection of keys
	 */
	public Collection<User> keys() {
		return this.database.keySet();
	}
}
