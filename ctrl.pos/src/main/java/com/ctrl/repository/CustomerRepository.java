package com.ctrl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrl.domains.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Customer findCustomerByCustMobileNo(long mobile);
}
