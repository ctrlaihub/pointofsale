package com.ctrl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrl.domains.Authority;
import com.ctrl.domains.User;

public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByActive(boolean b);

	List<User> findByAuthority(Authority authority);
	
}
