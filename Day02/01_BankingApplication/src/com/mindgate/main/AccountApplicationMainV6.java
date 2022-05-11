package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationMainV6 {

	public static void main(String[] args) {

		Current current = new Current(101, "Vivek", 10000, 50000);
		System.out.println(current);
		System.out.println("Withdraw : 5000");
		current.withdraw(5000);
		System.out.println(current);// overdraft : 50,0000 and balance : 50,000
		
		System.out.println();
		
		System.out.println("Withdraw : 20000");
		current.withdraw(20000);
		System.out.println(current);// overdraft : 35,0000 and balance : 0
		
		System.out.println();
		
		System.out.println("Deposit : 5000");
		current.deposit(5000);
		System.out.println(current);// overdraft : 40,0000 and balance : 0
		
		System.out.println();
		
		System.out.println("Deposit : 15000");
		current.deposit(15000);
		System.out.println(current);// overdraft : 50,0000 and balance : 5,000
	}

}
