package com.dtweb.services.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtweb.dto.CartDTO;
import com.dtweb.dto.ProductDTO;
import com.dtweb.services.CartService;
import com.dtweb.services.ProductService;

@Service
public class CartServiceImple implements CartService {
	public static final String CART="cartContain";
	@Autowired
	ProductService productService;
	
	@Autowired
	HttpSession session;
	
	CartDTO cart;
	
	public CartServiceImple() {
		
	}
	
	public void addCart(int id) {
		
	}

	public void removeCart(int id) {
		
	}

	public void payment() {
		// TODO Auto-generated method stub

	}

}
