package com.faith.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TblCustomer")
public class Customer {
	// Fields
	@Id		//making primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)		//making Identity
	private int customerId;
	
	private int accountNumber;
    private int pin;
    private String customerName;
    private String accountType;
    private double balance;
    private double minBalance;
    private long mobileNumber;
    private String emailId;
    
  //default constructor
	public Customer() {
		super();
	}
	
	//parameterized constructor
	public Customer(int customerId, int accountNumber, int pin, String customerName, String accountType, double balance,
			double minBalance, long mobileNumber, String emailId) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		this.minBalance = minBalance;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	//getters and setters
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	//OverridetoString
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountNumber=" + accountNumber + ", pin=" + pin
				+ ", customerName=" + customerName + ", accountType=" + accountType + ", balance=" + balance
				+ ", minBalance=" + minBalance + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}
    
  
}
