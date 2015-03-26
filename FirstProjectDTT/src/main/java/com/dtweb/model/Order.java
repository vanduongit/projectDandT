/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

/**
 * @author Thong Nguyen
 *
 */
public class Order {
	private int id;
	private Date date;
	private String code;
	private String typePay;
	private int status;
	private Date idate;
	private Date xdate;
	private String request;
	private String cusName;
	private String cusPhone;
	private String cusEmail;
	private String cusAddress;
	private String cusAddressShip;
	private String province;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the typePay
	 */
	public String getTypePay() {
		return typePay;
	}
	/**
	 * @param typePay the typePay to set
	 */
	public void setTypePay(String typePay) {
		this.typePay = typePay;
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
	 * @return the idate
	 */
	public Date getIdate() {
		return idate;
	}
	/**
	 * @param idate the idate to set
	 */
	public void setIdate(Date idate) {
		this.idate = idate;
	}
	/**
	 * @return the xdate
	 */
	public Date getXdate() {
		return xdate;
	}
	/**
	 * @param xdate the xdate to set
	 */
	public void setXdate(Date xdate) {
		this.xdate = xdate;
	}
	/**
	 * @return the request
	 */
	public String getRequest() {
		return request;
	}
	/**
	 * @param request the request to set
	 */
	public void setRequest(String request) {
		this.request = request;
	}
	/**
	 * @return the cusName
	 */
	public String getCusName() {
		return cusName;
	}
	/**
	 * @param cusName the cusName to set
	 */
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	/**
	 * @return the cusPhone
	 */
	public String getCusPhone() {
		return cusPhone;
	}
	/**
	 * @param cusPhone the cusPhone to set
	 */
	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}
	/**
	 * @return the cusEmail
	 */
	public String getCusEmail() {
		return cusEmail;
	}
	/**
	 * @param cusEmail the cusEmail to set
	 */
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	/**
	 * @return the cusAddress
	 */
	public String getCusAddress() {
		return cusAddress;
	}
	/**
	 * @param cusAddress the cusAddress to set
	 */
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	/**
	 * @return the cusAddressShip
	 */
	public String getCusAddressShip() {
		return cusAddressShip;
	}
	/**
	 * @param cusAddressShip the cusAddressShip to set
	 */
	public void setCusAddressShip(String cusAddressShip) {
		this.cusAddressShip = cusAddressShip;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	public Order(Date date, String code, String typePay, int status,
			Date idate, Date xdate, String request, String cusName,
			String cusPhone, String cusEmail, String cusAddress,
			String cusAddressShip, String province) {
		super();
		this.date = date;
		this.code = code;
		this.typePay = typePay;
		this.status = status;
		this.idate = idate;
		this.xdate = xdate;
		this.request = request;
		this.cusName = cusName;
		this.cusPhone = cusPhone;
		this.cusEmail = cusEmail;
		this.cusAddress = cusAddress;
		this.cusAddressShip = cusAddressShip;
		this.province = province;
	}
	
	public Order() {		
	}
	
	

}
