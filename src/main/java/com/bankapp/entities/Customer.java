package com.bankapp.entities;



public class Customer {

	private int customerId;
	private String name;
	private double balance;
	private boolean status;
	
	
	public Customer() {
	}
	
	
	public Customer(int customerId, String name, double balance, boolean status) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.balance = balance;
		this.status = status;
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
