package com.dtweb.dao;

import java.util.List;

import com.dtweb.model.Person;

//Duong dai ca vua comment o day
public interface PersonDAO {
	 
    public void save(Person p);
     
    public List<Person> list();
     
    public void remove(int id);
    
    public Person getPersonById(int id);
    
    public void update(Person p);
}
