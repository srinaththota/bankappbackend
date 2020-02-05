package com.bankapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bankapp.entities.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Customer> findAll(){
		return jdbcTemplate.query("select * from Customer", new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
	public Customer findById(int customerId){
		
		return jdbcTemplate.queryForObject("select * from Customer where customerId=?",new Object[] {customerId},
				new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
}
