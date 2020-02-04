package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMainv1 {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountNumber(1000);
		account.setName("Nikhila");
		account.setBalance(100);
		System.out.println("AccountNumber::"+account.getAccountNumber());
		System.out.println("Name::"+account.getName());
		System.out.println("Balance::"+account.getBalance());
		
	}
}
