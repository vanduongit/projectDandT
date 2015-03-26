/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

/**
 * @author Thong Nguyen
 *
 */
public class Promotion {
	private int id;
	private String content;
	private Date startDate;
	private Date endDate;
	private int proId;
	private float discountPercent;
	private float discountValue;
	private String description;
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
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
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
	 * @return the discountPercent
	 */
	public float getDiscountPercent() {
		return discountPercent;
	}
	/**
	 * @param discountPercent the discountPercent to set
	 */
	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
	}
	/**
	 * @return the discountValue
	 */
	public float getDiscountValue() {
		return discountValue;
	}
	/**
	 * @param discountValue the discountValue to set
	 */
	public void setDiscountValue(float discountValue) {
		this.discountValue = discountValue;
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
	public Promotion(String content, Date startDate, Date endDate, int proId,
			float discountPercent, float discountValue, String description,
			int active) {
		super();
		this.content = content;
		this.startDate = startDate;
		this.endDate = endDate;
		this.proId = proId;
		this.discountPercent = discountPercent;
		this.discountValue = discountValue;
		this.description = description;
		this.active = active;
	}
	
	public Promotion() {		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
