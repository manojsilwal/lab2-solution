package com.example.service;

import java.util.List;

import com.example.domain.User;

public interface UserService {
	public Boolean loginCheck(String name, String pass);
	public User findById(int id);
	public List<User> findAll();
	public void save(User user);
}
