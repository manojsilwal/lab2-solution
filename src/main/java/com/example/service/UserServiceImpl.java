package com.example.service;

import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService{

	UserRepo userRepo = new UserRepo();

	@Override
	public Boolean loginCheck(String username, String password) {
		User user = userRepo.findUser();
		if (username.equals(user.getName()) && password.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}

	}
	
}
