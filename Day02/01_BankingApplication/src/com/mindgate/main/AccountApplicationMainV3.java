package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {
	public static void main(String[] args) {

		System.out.println("Welcome to XYZ Bank");
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		String continueChoice;
		double amount;
		boolean result;

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		name = scanner.next();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Account Opened Successfully");
		System.out.println();
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");

			System.out.println("Enter your choice");
			int transactionChoice = scanner.nextInt();
			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to be withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result) {
					System.out.println("Transaction Completed Successfuly");
					System.out.println("Balance ::" + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance ::" + account.getBalance());
				}
				break;

			case 2:
				System.out.println("Enter amount to be deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result) {
					System.out.println("Transaction Completed Successfuly");
					System.out.println("Balance ::" + account.getBalance());
				} else {
					System.out.println("Transaction Failed");
					System.out.println("Balance ::" + account.getBalance());
				}
				break;

			case 3:
				System.out.println(account.getBalance());

				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue?(Yes/No)");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("Yes"));

		System.out.println("Thank you for banking with us!");

	}

}
