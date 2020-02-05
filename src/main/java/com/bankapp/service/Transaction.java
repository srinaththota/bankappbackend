package com.bankapp.service;

import java.util.List;

import com.bankapp.entities.Customer;
import com.bankapp.entities.TransactionDetails;

public interface Transaction {
	
	public int sendMoney(double amount, int sender , int receiver);
	List<TransactionDetails> viewTransactions(int customerid);

}
