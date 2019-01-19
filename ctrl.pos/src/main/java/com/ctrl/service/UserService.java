package com.ctrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctrl.dao.UserDao;
import com.ctrl.domains.Authority;
import com.ctrl.domains.User;
import com.ctrl.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDao userDao;
	/*
	 * For creating new User
	 *
	 * */
	public boolean createUser(User user){
		try{
			userRepository.save(user);
			return true;
			}catch(Exception e){
				return false;
			}
	}
	
	/*
	 * To list all Users
	 * 
	 * */
	public List<User> listAllUsers(){
		return userRepository.findAll();
	}
	
	/*
	 * To list only active Users
	 * 
	 * */
	public List<User> listAllActiveUsers()
	{
		return userRepository.findByActive(true);
	}
	
	/*
	 * To SOFT delete User
	 * 
	 */
	public boolean deleteUser(User user){
		try{
			userDao.updateUser(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public List<User> listAllManagers(){
		return userRepository.findByAuthority(Authority.MANAGER);
	}
	
	public List<User> listAllAdmins(){
		return userRepository.findByAuthority(Authority.ADMIN);
	}
	
	public List<User> listAllCashiers(){
		return userRepository.findByAuthority(Authority.CASHIER);
	}
	
	public List<User> listAllSellers(){
		return userRepository.findByAuthority(Authority.SELLER);
	}
	
	public User findUser(String name, String pwd){
		
		return userRepository.findByNameAndPassword(name,pwd);
	}	
}
