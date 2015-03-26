/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

/**
 * @author Thong Nguyen
 *
 */
public class OrderDetail {
	private int id;
	private int orderId;
	private int proId;
	private int quantity;
	private float originalPrice;
	private float payPrice;
	private Date date;
	private int status;
	private int promoId;
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
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the originalPrice
	 */
	public float getOriginalPrice() {
		return originalPrice;
	}
	/**
	 * @param originalPrice the originalPrice to set
	 */
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	/**
	 * @return the payPrice
	 */
	public float getPayPrice() {
		return payPrice;
	}
	/**
	 * @param payPrice the payPrice to set
	 */
	public void setPayPrice(float payPrice) {
		this.payPrice = payPrice;
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the promoId
	 */
	public int getPromoId() {
		return promoId;
	}
	/**
	 * @param promoId the promoId to set
	 */
	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}
	public OrderDetail(int orderId, int proId, int quantity,
			float originalPrice, float payPrice, Date date, int status,
			int promoId) {
		super();
		this.orderId = orderId;
		this.proId = proId;
		this.quantity = quantity;
		this.originalPrice = originalPrice;
		this.payPrice = payPrice;
		this.date = date;
		this.status = status;
		this.promoId = promoId;
	}
	
	public OrderDetail() {		
	}
	

}
