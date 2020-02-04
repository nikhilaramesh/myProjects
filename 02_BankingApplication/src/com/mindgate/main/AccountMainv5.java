package com.mindgate.main;

import com.mindgate.pojo.Savings;

public class AccountMainv5 {

	public static void main(String[] args) {
		Savings savings = new Savings(101,"Nikhi",2000,false);
		System.out.println(savings);
		System.out.println("withdraw::1000");
		if(savings.withdraw(200))
			System.out.println("success");
		else
			System.out.println("failed");
		System.out.println(savings);
		
		System.out.println("deposit::1000");
		if(savings.deposit(1000))
			System.out.println("success");
		else
			System.out.println("failed");
		System.out.println(savings);
	}
	
}
