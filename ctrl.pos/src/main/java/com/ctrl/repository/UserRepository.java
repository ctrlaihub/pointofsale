package com.ctrl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrl.domains.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
