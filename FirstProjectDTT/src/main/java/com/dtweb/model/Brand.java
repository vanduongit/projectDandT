/**
 * 
 */
package com.dtweb.model;

/**
 * @author User
 *
 */
public class Brand {
	private int id;
	private String name;
	private String logo;
	private int ord;
	private String lang;
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
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}
	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}
	public Brand(int id, String name, String logo, int ord, String lang) {		
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.ord = ord;
		this.lang = lang;
	}
	
	public Brand(String name, String logo, int ord, String lang) {		
		this.name = name;
		this.logo = logo;
		this.ord = ord;
		this.lang = lang;
	}
	
	
	
	
	

}
