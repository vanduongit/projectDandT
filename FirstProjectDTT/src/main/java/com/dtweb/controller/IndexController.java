package com.dtweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dtweb.dao.PersonDAO;
import com.dtweb.model.Person;
import com.dtweb.services.PersonService;

@Controller
public class IndexController {
	
	PersonService personService;
	
	@RequestMapping(value="/")
	public String index(Model model){
		model.addAttribute("person",new Person());
		return "insert";
	}
	
	@RequestMapping(value="/show")
	public String show(Model map){
		map.addAttribute("list", personService.list());
		return "showList";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("person") Person person){
		personService.save(person);
		return "redirect:/show";
	}
	
	@RequestMapping(value="/remove/{id}")
	public String remove(@PathVariable("id") int id){
		personService.remove(id);
		return "redirect:/show";
	}
	
	@RequestMapping(value="/showEdit/{id}")
	public String showEdit(@PathVariable("id") int id,Model model){
		
		model.addAttribute("person",personService.getPersonById(id));
		
		return "edit";
	}
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit(@ModelAttribute("person") Person person){
		personService.update(person);
		return "redirect:/show";
	}
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
}
