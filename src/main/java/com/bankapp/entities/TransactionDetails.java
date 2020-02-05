package com.bankapp.entities;

public class TransactionDetails {

	private int fromCustomer;
	private int toCustomer;
	private double amount;
	
	
	public TransactionDetails() {
		super();
	}
	
	
	public TransactionDetails(int fromCustomer, int toCustomer, double amount) {
		super();
		this.fromCustomer = fromCustomer;
		this.toCustomer = toCustomer;
		this.amount = amount;
	}


	public int getFromCustomer() {
		return fromCustomer;
	}
	public void setFromCustomer(int fromCustomer) {
		this.fromCustomer = fromCustomer;
	}
	public int getToCustomer() {
		return toCustomer;
	}
	public void setToCustomer(int toCustomer) {
		this.toCustomer = toCustomer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
