package edu.westga.se1.collectiblemanager.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserManager {

	private Map<String, String> users;
	
	public UserManager() {
		this.users = new HashMap<String, String>();
	}
	

	/**
	 * Clears the HashMap
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void clear() {
		this.users.clear();
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
	public String get(String key) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		return this.users.get(key);
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
	public boolean containsKey(String key) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		return this.users.containsKey(key);
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
		return this.users.isEmpty();
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
	public boolean add(String key, String value) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		if (value == null) {
			throw new IllegalArgumentException("Value cannot be null");
		}
		if (!this.users.containsKey(key)) {
			this.users.put(key, value);
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
	public void update(String key, String value) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		if (value == null) {
			throw new IllegalArgumentException("value cannot be null");
		}
		this.users.replace(key, value);
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
	public boolean remove(String key) {
		if (key == null) {
			throw new IllegalArgumentException("Key cannot be null");
		}
		if (this.users.containsKey(key)) {
			this.users.remove(key);
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
		return this.users.size();
	}

	/**
	 * Gets a collection of Values
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a Collection of Values
	 */
	public Collection<String> values() {
		return this.users.values();
	}

	/**
	 * Gets a collection of keys
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a Collection of keys
	 */
	public Collection<String> keys() {
		return this.users.keySet();
	}
	
}
