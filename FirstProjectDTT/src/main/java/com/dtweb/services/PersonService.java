package com.dtweb.services;

import java.util.List;

import com.dtweb.model.Person;

public interface PersonService {
	public void save(Person p);
    
    public List<Person> list();
}
