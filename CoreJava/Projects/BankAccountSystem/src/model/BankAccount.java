package model;

import java.util.List;
import util.Transaction;
import java.util.ArrayList;

public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private String accountType; // e.g., "Savings", "Current"
	private List<Transaction> transactionHistory;

	public BankAccount(String accountNumber, String accountHolderName, String accountType) {

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
		this.accountType = accountType;
		this.transactionHistory = new ArrayList<>();

	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			transactionHistory.add(new Transaction("DEPOSIT", amount));
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			transactionHistory.add(new Transaction("WITHDRAW", amount));
		} else {
			System.out.println("Insuffucent funds!");
		}
	}

	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Type: " + accountType);
		System.out.println("Balance: ₹" + balance);
	}

	public void displayTransactionHistory() {
		System.out.println("\nTransaction History for " + accountHolderName + ":");

		for (Transaction transaction : transactionHistory) {
			System.out.println(transaction);
		}
	}

	// Getters and Setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

}
