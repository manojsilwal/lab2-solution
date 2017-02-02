package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserDao;
import com.example.repository.UserRepo;

public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	
	
	@Override
	public Boolean loginCheck(String username, String password) {
		User user = userDao.findByUsername(username);
		if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	 @PreAuthorize("hasRole('ROLE_ADMIN')")
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}
	
	
	
}
