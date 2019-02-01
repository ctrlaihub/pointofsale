package com.ctrl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrl.domains.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{
	
	Customer findCustomerByCustMobileNo(long mobile);

	Customer getOne(String id);
	
}
