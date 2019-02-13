package com.ctrl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ctrl.domains.Authority;
import com.ctrl.domains.User;

public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByActive(boolean b);

	List<User> findByAuthority(Authority authority);
		
	User findByEmailAndPassword(String email,String pwd);
	
	@Modifying(clearAutomatically = true)
	@Query("update User user set user.password=:pass where user.email =:email")
	void updatePassword(@Param("email") String email, @Param("pass") String password);
	
	void deleteById(Long id);
	
}