package com.dtweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	
	@RequestMapping(value="/cart/show")
	public String showCard(){
		return "cart";
	}
	
}
