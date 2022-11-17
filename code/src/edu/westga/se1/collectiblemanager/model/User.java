package edu.westga.se1.collectiblemanager.model;

/**
 * User class
 * 
 * @author Michael Lee
 *
 */
public class User {

	private String username;
	private String password;

	/**
	 * User class
	 * 
	 * @precondition name != null && !name.isEmpty() && password != null &&
	 *               !password.isEmpty()
	 * @postcondition none
	 * @param name     the
	 * @param password
	 */
	public User(String username, String password) {
		if (username == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		if (username.isEmpty()) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		if (password == null) {
			throw new IllegalArgumentException("password cannot be null");
		}
		if (password.isEmpty()) {
			throw new IllegalArgumentException("password cannot be null");
		}
		this.username = username;
		this.password = password;
	}

	/**
	 * Gets the name
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return the name
	 */
	public String getName() {
		return this.username;
	}

	/**
	 * Sets the user name
	 * 
	 * @precondition name != null
	 * @postcondition none
	 * @param username the name to be set
	 */
	public void setUserName(String username) {
		if (username == null) {
			throw new NullPointerException("name cannot be null");
		}
		this.username = username;
	}

	/**
	 * Gets the password
	 * 
	 * @precondition none
	 * @postcondition none
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets the password
	 * 
	 * @precondition
	 * @param password
	 */
	public void setPassword(String password) {
		if (password == null) {
			throw new NullPointerException("password cannot be null");
		}
		this.password = password;
	}
}
