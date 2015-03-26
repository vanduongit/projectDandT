/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

/**
 * @author Thong Nguyen
 *
 */
public class ConfigSys {
	private int id;
	private String name;
	private String value;
	private String description;
	private Date createDate;
	private Date effDate;
	private Date expDate;
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the effDate
	 */
	public Date getEffDate() {
		return effDate;
	}
	/**
	 * @param effDate the effDate to set
	 */
	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}
	/**
	 * @return the expDate
	 */
	public Date getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
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
	public ConfigSys(String name, String value, String description,
			Date createDate, Date effDate, Date expDate, int active) {
		super();
		this.name = name;
		this.value = value;
		this.description = description;
		this.createDate = createDate;
		this.effDate = effDate;
		this.expDate = expDate;
		this.active = active;
	}
	
	public ConfigSys() {		
	}

}
