package com.dtweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dtweb.model.Person;

public class PersonDAOImpl implements PersonDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Person p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Person> list() {
		Session session = this.sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}

	public void remove(int id) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Person p = (Person) session.load(Person.class, new Integer(id));
		if (p != null) {
			session.delete(p);
		}
		tx.commit();
		session.close();
	}

	public Person getPersonById(int id) {
		Session session=this.sessionFactory.openSession();
		Person p=(Person) session.load(Person.class, new Integer(id));
		
		return p;
	}

	public void update(Person p) {
		Session session=this.sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
	}

	
}
