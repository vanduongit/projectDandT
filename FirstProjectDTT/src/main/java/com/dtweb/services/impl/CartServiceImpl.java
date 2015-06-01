package com.dtweb.services.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtweb.dto.CartDTO;
import com.dtweb.dto.ProductDTO;
import com.dtweb.model.Product;
import com.dtweb.services.CartService;
import com.dtweb.services.ProductService;

@Service
public class CartServiceImpl implements CartService {
	public static final String CART="cartContain";
	@Autowired
	ProductService productService;
	
	HttpSession session;
	
	CartDTO cart;
	
	public CartServiceImpl() {
		
	}
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	public void addCart(int id, int quantity) {
		ProductDTO product=productService.getProductDTOById(id);
		if(product != null){
			int newQuan=0;
			if(cart.getListProduct().containsKey(product)){
				int oldQuan=cart.getListProduct().get(product);
				newQuan=oldQuan+quantity;
			}else{
				newQuan=quantity;
			}
			cart.getListProduct().put(product, newQuan);
		}
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public void removeCart(int id) {
		ProductDTO product=productService.getProductDTOById(id);
		cart.getListProduct().remove(product);
	}
	
	

	public void payment() {
		// TODO Auto-generated method stub

	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
		getCart();
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public void getCart() {
		if(session!=null){
			cart=(CartDTO)session.getAttribute("cartContain");
			if(cart==null){
				cart=new CartDTO();
				session.setAttribute("cartContain", cart);
			}
		}
	}

	public void setCart(CartDTO cart) {
		this.cart = cart;
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public void changeQuantity(int id, int quantity) {
		ProductDTO product=productService.getProductDTOById(id);
		if(product!=null){
			cart.getListProduct().put(product, quantity);
		}
	}

	public CartDTO getCartDTO() {
		return this.cart;
	}
	
	
}
