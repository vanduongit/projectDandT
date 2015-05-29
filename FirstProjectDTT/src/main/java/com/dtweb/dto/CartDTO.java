package com.dtweb.dto;

import java.util.HashMap;
import java.util.Map;

import com.dtweb.model.Product;

public class CartDTO {
	Map<Product,Integer> listProduct;
	int totalPrice;
	
	public CartDTO() {
		listProduct=new HashMap<Product, Integer>();
	}

	public int getTotalPrice() {
		totalPrice=0;
		
		
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Map<Product, Integer> getListProduct() {
		return listProduct;
	}

	public void setListProduct(Map<Product, Integer> listProduct) {
		this.listProduct = listProduct;
	}

	
	
	
}
