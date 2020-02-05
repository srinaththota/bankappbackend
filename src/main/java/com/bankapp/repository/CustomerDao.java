package com.bankapp.repository;

import java.util.List;

import com.bankapp.entities.Customer;


public interface CustomerDao{

	public List<Customer> findAll();
	public Customer findById(int customerId);
}
