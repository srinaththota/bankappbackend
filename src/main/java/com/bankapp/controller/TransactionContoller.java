package com.bankapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.entities.Customer;
import com.bankapp.repository.CustomerDaoImpl;
import com.bankapp.service.Transaction;

@RestController
public class TransactionContoller {

	@Autowired
	Transaction transaction;
	
	@Autowired
	CustomerDaoImpl customerDao;
	
	@RequestMapping("/samplebank")
	public String getMessage() {

		Customer sender=customerDao.findById(1001);
		Customer receiver=customerDao.findById(1002);
		transaction.sendMoney(100.0, sender.getCustomerId(), receiver.getCustomerId());
		
		return "Welcome to the Sample Bank";
	}
}
