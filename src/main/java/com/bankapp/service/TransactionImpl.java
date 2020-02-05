package com.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bankapp.entities.Customer;
import com.bankapp.entities.TransactionDetails;
import com.bankapp.repository.TransactionDao;;

@Component
public class TransactionImpl implements Transaction {
	
	@Autowired
	TransactionDao transactionDao;

	@Override
	public int sendMoney(double amount, int sender,int receiver) {
		// TODO Auto-generated method stub
	return	transactionDao.insertTransactions(sender, receiver, amount);
		
	}

	@Override
	public List<TransactionDetails> viewTransactions(int customerid) {
		// TODO Auto-generated method stub
		return null;
	}

}
