/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

/**
 * @author Thong Nguyen
 *
 */
public class CommentProduct {

	
	private int proId;
	private String name;
	private String email;
	private int point;
	private String content;
	private Date date;
	private int active;
	/**
	 * @return the proId
	 */
	public int getProId() {
		return proId;
	}
	/**
	 * @param proId the proId to set
	 */
	public void setProId(int proId) {
		this.proId = proId;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the point
	 */
	public int getPoint() {
		return point;
	}
	/**
	 * @param point the point to set
	 */
	public void setPoint(int point) {
		this.point = point;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
	public CommentProduct(int proId, String name, String email, int point,
			String content, Date date, int active) {
		super();
		this.proId = proId;
		this.name = name;
		this.email = email;
		this.point = point;
		this.content = content;
		this.date = date;
		this.active = active;
	}
	public CommentProduct() {		
	}
	
	
}
