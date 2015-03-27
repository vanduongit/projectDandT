/**
 * 
 */
package com.dtweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Thong Nguyen
 *
 */

@Entity
@Table(name = "configsys")
public class ConfigSys implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
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
	@Column(name = "NAME",  nullable = false, length = 200)
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
	@Column(name = "VALUE",  nullable = false, length = 200)
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
	@Column(name = "DESCRIPTION",  nullable = false)
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
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_CREATED", nullable = false)	
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
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_EFF")	
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
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_EXP")	
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
	@Column(name = "ACTIVE")
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
