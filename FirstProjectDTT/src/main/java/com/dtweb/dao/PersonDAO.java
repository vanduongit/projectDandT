package com.dtweb.dao;

import java.util.List;

import com.dtweb.model.Person;


public interface PersonDAO {
	 
    public void save(Person p);
     
    public List<Person> list();
     
}
