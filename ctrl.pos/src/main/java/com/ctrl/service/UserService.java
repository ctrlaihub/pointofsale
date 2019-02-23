package com.ctrl.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctrl.dao.UserDao;
import com.ctrl.domains.Authority;
import com.ctrl.domains.Employee;
import com.ctrl.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private JavaMailSender sender;

	/*
	 * For creating new User
	 *
	 * */
	public boolean createUser(Employee user){
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
	public List<Employee> listAllUsers(){
		return userRepository.findAll();
	}
	
	/*
	 * To list only active Users
	 * 
	 * */
	public List<Employee> listAllActiveUsers()
	{
		return userRepository.findByActive(true);
	}
	
	/*
	 * To SOFT delete User
	 * 
	 */
/*	public boolean deleteUser(User user){
		try{
			userDao.updateUser(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}
*/	
	public List<Employee> listAllManagers(){
		return userRepository.findByAuthority(Authority.MANAGER);
	}
	
	public List<Employee> listAllAdmins(){
		return userRepository.findByAuthority(Authority.ADMIN);
	}
	
	public List<Employee> listAllCashiers(){
		return userRepository.findByAuthority(Authority.CASHIER);
	}
	
	public List<Employee> listAllSellers(){
		return userRepository.findByAuthority(Authority.SELLER);
	}
		
	public Employee findUserByEmail(String email, String pwd){	
		return userRepository.findByEmailAndPassword(email, pwd);
	}
	
	public String sendMail(String toMailAddress) {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {
			helper.setTo(toMailAddress);
			helper.setText(
					"<html><body>Reset your password with this link <a href='http://localhost:8080/ctrlaihub/resetPassword?email="+ toMailAddress +"'>Reset Password</a><body></html>",
					true);
			helper.setSubject("Reset Password Link");
		} catch (MessagingException e) {
			e.printStackTrace();
			return "Error while sending mail ..";
		}
		sender.send(message);
		return "<h4><font color = 'red'>Mail Sent! Please check your mail.</font></h4>";
	}
	
	public String updatePassword(String email, String password) {
		try {		
			/*User userToUpdate = userRepository.getOne(user.getEmail());
			userToUpdate.setPassword(user.getPassword());
			userRepository.save(userToUpdate);*/
			System.out.println( " SERVICE email --------> " +  email + " password ------> " + password);
			userRepository.updatePassword(email, password);
			return "<h5><font color = 'red'>" +"Password updated successfully. Login Again! </font></h5>";
		} catch (Exception e) {
			System.out.println("Exception -----------------> " + e);
			return null;
		}
	}

	public boolean deleteUser(String id) {	
		try{
			userRepository.deleteById(id);
			return true;
			}catch(Exception e){
				return false;
			}
	}

	public Employee updateUser(Employee emp) {
		try {
			Employee employeeToUpdate = userRepository.getOne(emp.getId());
			employeeToUpdate.setName(emp.getName());
			employeeToUpdate.setEmail(emp.getEmail());
			employeeToUpdate.setActive(emp.isActive());
			//employeeToUpdate.setAuthority(emp.getAuthority());
			employeeToUpdate.setAddress(emp.getAddress());
			userRepository.save(employeeToUpdate);
			return employeeToUpdate;
		} catch (Exception e) {
			System.out.println("Exception -----------------> " + e);
			return null;
		}
	}	
}