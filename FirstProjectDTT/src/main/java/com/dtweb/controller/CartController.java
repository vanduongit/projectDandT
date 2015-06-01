package com.dtweb.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dtweb.dto.CartDTO;
import com.dtweb.dto.ProductDTO;
import com.dtweb.model.Product;
import com.dtweb.services.CartService;
import com.dtweb.services.ProductService;

@Controller
public class CartController {
	
	
	@Autowired
	ProductService productService;

	@Autowired
	CartService cartService;
	
	@RequestMapping(value="/cart/show")
	public String showCart(Model model){
		
		return "cart";
	}
	
	@RequestMapping(value="/cart/add/{id}", method=RequestMethod.GET)
	public String addCart(@PathVariable("id") int id,@RequestParam("quantity") int quantity,
			HttpSession session){
		String forward="redirect:/cart/show";
	    cartService.setSession(session);
		cartService.addCart(id, quantity);
		return forward;
	}
	
	@RequestMapping(value="/cart/remove/{id}", method=RequestMethod.GET)
	public @ResponseBody CartDTO removeCart(@PathVariable("id") int id,HttpSession session){
		cartService.setSession(session);
		cartService.removeCart(id);
		return (CartDTO)session.getAttribute("cartContain");
	}
}
