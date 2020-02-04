package com.mindgate.main;

import com.mindgate.pojo.Account;

public class Currentv5 extends Account {
	
		private double creditLimit;
		public  Currentv5()
		{
			
		}
		
		public Currentv5(int accountNumber,String name,double balance,double creditLimit){
			super(accountNumber,name,balance);
			this.creditLimit=creditLimit;	
		}
		public boolean withdraw(double amount){
			return false;
		}
		public boolean deposit(double amount){
			return false;
		}
		public double getCreditLimit(){
			return creditLimit;
		}
		public void setCreditLimit(double creditLimit){
			this.creditLimit=creditLimit;
		}

		@Override
		public String toString() {
			return "Currentv5 [creditLimit=" + creditLimit + ", getAccountNumber()=" + getAccountNumber()
					+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
		}
			
}
