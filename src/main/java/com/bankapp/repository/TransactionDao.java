package com.bankapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insertTransactions(int fromCustomer , int toCustomer , double amount) {
		return jdbcTemplate.update("insert into TransactionDetails values(?,?,?)", new Object[] {fromCustomer,toCustomer,amount});
	}
	
}
