package com.dtweb.services;

/**
 * @author DuongPV1
 * 
 * */
public interface CartService {
	void addCart(int id);
	void removeCart(int id);
	void payment();
}
