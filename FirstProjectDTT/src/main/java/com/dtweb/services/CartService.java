package com.dtweb.services;

import javax.servlet.http.HttpSession;

import com.dtweb.dto.CartDTO;

/**
 * @author DuongPV1
 * 
 * */
public interface CartService {
	/**
	 * @author DuongPV1
	 * 
	 * */
	void addCart(int id, int quantity);
	/**
	 * @author DuongPV1
	 * 
	 * */
	void removeCart(int id);
	/**
	 * @author DuongPV1
	 * 
	 * */
	void payment();
	/**
	 * @author DuongPV1
	 * 
	 * */
	void setSession(HttpSession session);
	/**
	 * @author DuongPV1
	 * 
	 * */
	void changeQuantity(int id, int quantity);
	/**
	 * @author DuongPV1
	 * @return 
	 * 
	 * */
	CartDTO getCartDTO();
	
}
