package com.ctrl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ctrl.domains.User;

@Repository
public class UserDao {

	@PersistenceContext	
	private EntityManager entityManager;
	
	/*public void updateUser(User user){
	User oldUser=(User)entityManager.find(User.class, user.getId());
	oldUser.setActive(false);
	}*/
}
