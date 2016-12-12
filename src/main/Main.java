package main;

import bank.*;
import bank.Account;
import bank.Bank;
import bank.User;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		User user1 = new User("John", "Doe");
		User user2 = new User("Matt", "Damon");
		Account acc1 = new Account(user1);acc1.addFunds(1000);
		Account acc2 = new Account(user2);acc2.addFunds(2500);
		bank.addAccount(acc1);bank.addAccount(acc2);
		System.out.println(bank.toString());
	}
}
