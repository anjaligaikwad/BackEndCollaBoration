package com.niit.backendcollaboration.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendcollaboration.model.User;

@Repository
@EnableTransactionManagement
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;


	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);

	}

	public void updateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);

	}

	public void deleteUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);

	}

	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByUserId(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isExistingUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}