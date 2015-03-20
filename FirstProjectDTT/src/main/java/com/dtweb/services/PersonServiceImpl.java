package com.dtweb.services;

import java.util.List;

import com.dtweb.dao.PersonDAO;
import com.dtweb.model.Person;

public class PersonServiceImpl implements PersonService{

	PersonDAO personDAO;
	public void save(Person p) {
		personDAO.save(p);
	}

	public List<Person> list() {
		
		return personDAO.list();
	}
	
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	public void remove(int id) {
		personDAO.remove(id);
	}

	public Person getPersonById(int id) {
		
		return personDAO.getPersonById(id);
	}

	public void update(Person p) {
		personDAO.update(p);
	}

}
