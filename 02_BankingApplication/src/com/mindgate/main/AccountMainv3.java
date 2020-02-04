package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountMainv3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		System.out.println("Enter account number:");
		accountNumber = sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter balance:");
		balance=sc.nextDouble();
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
		System.out.println("Enter the choice:");
		int choice= sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("balance::"+account.getBalance());
			break;
		case 2:
			if(account.deposit(200)){
				System.out.println("deposit success");
			}else{
				System.out.println("deposit failed");
			}
			break;
		case 3:
			if(account.withdraw(300)){
				System.out.println("withdraw success");
				}else{
					System.out.println("withdraw failed");
				}
			break;
		default:
			System.out.println("Try again");
			break;
		}
		
			
	}

}
