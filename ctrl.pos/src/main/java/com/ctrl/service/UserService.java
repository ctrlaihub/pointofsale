package com.ctrl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctrl.domains.User;
import com.ctrl.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> listAllUsers(){
		return userRepository.findAll();
	}
	
	public void createUser(User user){
		userRepository.save(user);
	} 
}
