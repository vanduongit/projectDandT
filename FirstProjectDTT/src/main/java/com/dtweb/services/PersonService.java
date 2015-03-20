package com.dtweb.services;

import java.util.List;

import com.dtweb.model.Person;

public interface PersonService {
	public void save(Person p);
    
    public List<Person> list();
    
    public void remove(int id);
    
    public Person getPersonById(int id);
    
    public void update(Person p);
}
