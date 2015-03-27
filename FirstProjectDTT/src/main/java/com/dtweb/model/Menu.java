/**
 * 
 */
package com.dtweb.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Thong Nguyen
 *
 */
@Entity
@Table(name = "menu")
public class Menu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8120457653218907348L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@Column(name = "NAME", length = 256, nullable = false)
	private String name;
	@Column(name = "LOGO", length = 256)
	private String logo;
	@Column(name = "LINK", length = 256)
	private String link;
	@Column(name = "ACTIVE")
	private int active;
	@Column(name = "ORD")
	private int ord;
	
	@ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "PARENT_ID")
	private Menu parentId;
	
	@OneToMany(mappedBy = "parentId")
    private Set<Menu> subordinates = new HashSet<Menu>();
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
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}
	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
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
	
	public Menu(String name, String logo, String link, int active, int ord) {
		super();
		this.name = name;
		this.logo = logo;
		this.link = link;
		this.active = active;
		this.ord = ord;		
	}
	public Menu getParentId() {
		return parentId;
	}
	public void setParentId(Menu parentId) {
		this.parentId = parentId;
	}
	
	public Menu(int id, String name, String logo, String link, int active,
			int ord, Menu parentId) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.link = link;
		this.active = active;
		this.ord = ord;
		this.parentId = parentId;
	}
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
	
	public Menu() {		
	}
	

}
