package com.dtweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dtweb.dao.PersonDAO;
import com.dtweb.services.PersonService;

@Controller
public class IndexController {
	
	PersonService personService;
	
	@RequestMapping(value="/")
	public String index(){
		return "index"; 
	}
	
	@RequestMapping(value="/show")
	public String show(Model map){
		map.addAttribute("list", personService.list());
		return "showList";
	}
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
}
