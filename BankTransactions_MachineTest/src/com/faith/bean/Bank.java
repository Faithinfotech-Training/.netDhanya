package com.faith.bean;

import java.util.Random;

public class Bank {
	
	//instance variables
	long accountNumber;
	String customerName;
	String accountType;
	int balance;
	double minimumBalance=2000;
	long mobileNo;
	String emailId;
	int atmPin;
	
	//Default Constructor
	public Bank() {
		super();
	}
	
	//Parameterized Constructor
	public Bank(long accountNumber, String customerName, String accountType,
			int balance, double minimumBalance, long mobileNo, String emailId,
			int atmPin) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.atmPin = atmPin;
	}
	
	//getters and setters
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getAtmPin() {
		return atmPin;
	}
	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	
	//Generate AccountNumber --Auto generate
	public static  int generateAccountNumber() {
		Random rand =new Random();
		return rand.nextInt(999999999);
	
	}
	
	//Generate Pin Number --Auto generate
		public static  int generatePinNumber() {
			Random rand =new Random();
			//return rand.nextInt(999999999);
			int pin = 9000 + rand.nextInt(100);
			return pin;
		
		}
	
	
	//Override toString
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", accountType=" + accountType + ", balance="
				+ balance + ", minimumBalance=" + minimumBalance
				+ ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", atmPin=" + atmPin + "]";
	}
	
	

}
