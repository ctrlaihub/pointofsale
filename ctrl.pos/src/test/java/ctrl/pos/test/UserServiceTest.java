package ctrl.pos.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import com.ctrl.domains.stock.Category;
import com.ctrl.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = Application.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	
	@Test
	public void CreateUser(){
		
		User user=new User();
		
		user.setActive(true);
		user.setEmail("deepane3e@gmail.com");
		user.setName("deepane");
		user.setPassword("deee");
		
		Address address = new Address();
		address.setStreet("xyz");
		address.setCity("chennai");
		address.setState("TN");
		address.setZipcode(1234567);
		address.setActive(true);
		
		user.setAddress(address);
		
		Set<Authority> authority=new HashSet<>();
		authority.add(Authority.SELLER);
		authority.add(Authority.ADMIN);
		user.setAuthority(authority);
		
		
		User userr=new User();
		
		userr.setActive(true);
		userr.setEmail("dee@gmail.com");
		userr.setName("dee");
		userr.setPassword("dee");
		
		Address addresss = new Address();
		addresss.setStreet("xyz");
		addresss.setCity("chennai");
		addresss.setState("TN");
		addresss.setZipcode(1234567);
		
		userr.setAddress(addresss);
		
		Set<Authority> authorityy=new HashSet<>();
		authorityy.add(Authority.MANAGER);
		userr.setAuthority(authorityy);
		
		userService.createUser(user);
//		userService.createUser(userr);
		
//		List<User> l1=new ArrayList<>();
//		userService.listAllManagers().forEach(l1::add);
//		System.out.println(l1);
	}
}
