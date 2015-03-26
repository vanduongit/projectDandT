/**
 * 
 */
package com.dtweb.model;

/**
 * @author Thong Nguyen
 *
 */
public class Administrator {
	private int id;
	private String name;
	private String username;
	private String password;
	private String role;
	private int ord;
	private int active;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the ord
	 */
	public int getOrd() {
		return ord;
	}
	/**
	 * @param ord the ord to set
	 */
	public void setOrd(int ord) {
		this.ord = ord;
	}
	/**
	 * @return the active
	 */
	public int getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(int active) {
		this.active = active;
	}
	public Administrator(String name, String username, String password,
			String role, int ord, int active) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
		this.ord = ord;
		this.active = active;
	}
	
	public Administrator() {		
	}
}
