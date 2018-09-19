package ctrl.pos.test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.ctrl.cfg.Application;
import com.ctrl.domains.Address;
import com.ctrl.domains.Authority;
import com.ctrl.domains.User;
import com.ctrl.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Application.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void UserTest(){
		
		User user=CreateUser();
		userService.createUser(user);
	}
	
	public User CreateUser(){
		
		User user=new User();
		
		user.setActive(true);
		user.setEmail("deepan@gmail.com");
		user.setName("deepan");
		user.setPassword("dee");
		
		Address address = new Address();
		address.setStreet("xyz");
		address.setCity("chennai");
		address.setState("TN");
		address.setZipcode(1234567);
		
		user.setAddress(address);
		
		Set<Authority> authority=new HashSet<>();
		authority.add(Authority.ADMIN);
		user.setAuthority(authority);
		
		return user;
	}
}
