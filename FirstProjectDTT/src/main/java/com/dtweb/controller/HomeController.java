package com.dtweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dtweb.services.ProductService;


@Controller
public class HomeController {
	
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/")
	public String index(Model model){
		model.addAttribute("listProduct", productService.getAllProduct());
		return "index";
	}
//	
//	@RequestMapping(value="/show")
//	public String show(Model map){
//		map.addAttribute("list", personService.list());
//		return "showList";
//	}
//	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String add(@ModelAttribute("person") Person person){
//		personService.save(person);
//		return "redirect:/show";
//	}
//	
//	@RequestMapping(value="/remove/{id}")
//	public String remove(@PathVariable("id") int id){
//		personService.remove(id);
//		return "redirect:/show";
//	}
//	
//	@RequestMapping(value="/showEdit/{id}")
//	public String showEdit(@PathVariable("id") int id,Model model){
//		
//		model.addAttribute("person",personService.getPersonById(id));
//		
//		return "edit";
//	}
//	@RequestMapping(value="/edit", method=RequestMethod.POST)
//	public String edit(@ModelAttribute("person") Person person){
//		personService.update(person);
//		return "redirect:/show";
//	}
//	
//	public void setPersonService(PersonService personService) {
//		this.personService = personService;
//	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
}
