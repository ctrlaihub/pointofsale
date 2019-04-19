package com.ctrl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctrl.domains.Customer;
import com.ctrl.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public boolean addCustomer(Customer customer) {
		try {
			customerRepository.save(customer);
			return true;
		} catch (Exception e) {
			System.out.println("Exception -----------------> " + e);
			return false;
		}
	}

	public Customer listAllCustomers(long mobile) {
		return customerRepository.findCustomerByCustMobileNo(mobile);
	}

	public Customer updateCustomer(Customer customer) {
		try {
			Customer customerToUpdate = customerRepository.getOne(customer.getId());
			customerToUpdate.setCustName(customer.getCustName());
			customerToUpdate.setEmail(customer.getEmail());
			customerToUpdate.setCustType(customer.getCustType());
			customerToUpdate.setAddress(customer.getAddress());
			customerToUpdate.setCustMobileNo(customer.getCustMobileNo());
			customerRepository.save(customerToUpdate);
			return customerToUpdate;
		} catch (Exception e) {
			System.out.println("Exception -----------------> " + e);
			return null;
		}
	}
}