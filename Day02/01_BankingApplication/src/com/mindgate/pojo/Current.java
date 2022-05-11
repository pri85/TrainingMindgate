package com.mindgate.pojo;

public class Current extends Account {

	private double overdraftBalance;
	double tempOverdraftBalance;

	public Current() {

		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		tempOverdraftBalance = overdraftBalance;
		System.out.println("Overloaded constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount<getBalance() && !(getBalance()-amount>getOverdraftBalance())) {			
			setBalance(getBalance()-amount);
			return true;
		}
		if (amount>getBalance() && (amount-getBalance())<getOverdraftBalance()) {
			Double amt = amount-getBalance();
			setBalance(0.0);
			setOverdraftBalance(getOverdraftBalance()-amt);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (tempOverdraftBalance==getOverdraftBalance() && amount>0) {
			setBalance(getBalance() + amount);
			return true;
		}
		if (tempOverdraftBalance!=getOverdraftBalance()) {
			
			if (tempOverdraftBalance>amount) {
				setOverdraftBalance(getOverdraftBalance()+amount);
			}
			Double temp = tempOverdraftBalance-amount;
			setOverdraftBalance(getOverdraftBalance()+(getOverdraftBalance()-amount));
			
			setBalance(getBalance()+(amount-temp));
			return true;
		}
		
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

	

}
