/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Thong Nguyen
 *
 */

@Entity
@Table(name = "order_detail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 200, nullable = false)
	private int id;	
	
	@Column(name = "PRO_ID")
	private int proId;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "ORIGINAL_PRICE")
	private float originalPrice;
	
	@Column(name = "PAY_PRICE")
	private float payPrice;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "STATUS")
	private int status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PROMO", nullable = false)
	private Promotion promotion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID", nullable = false)
	private Order order;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
	public OrderDetail(int proId, int quantity, float originalPrice,
			float payPrice, Date date, int status, Promotion promotion,
			Order order) {
		super();
		this.proId = proId;
		this.quantity = quantity;
		this.originalPrice = originalPrice;
		this.payPrice = payPrice;
		this.date = date;
		this.status = status;
		this.promotion = promotion;
		this.order = order;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderDetail [proId=" + proId + ", quantity=" + quantity
				+ ", originalPrice=" + originalPrice + ", payPrice=" + payPrice
				+ ", date=" + date + ", status=" + status + ", promotion="
				+ promotion + ", order=" + order + "]";
	}
	public OrderDetail() {		
	}
	

}
