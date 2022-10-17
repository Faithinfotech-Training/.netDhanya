package com.faith.app;

import java.util.Scanner;

import com.faith.lib.Bank_MenuList;

public class BankApp {

	public static void main(String[] args) {
		mainMenu();

	}

	public static void mainMenu() {

		System.out.println("Welcome to Bank Transactions App");
		
			Bank_MenuList.menu();


	}

}
