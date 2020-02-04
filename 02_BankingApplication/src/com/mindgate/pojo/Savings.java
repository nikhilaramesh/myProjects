package com.mindgate.pojo;

public class Savings extends Account{
	private boolean isSalary;
	public Savings(){
	
		}
	public Savings(int accountNumber,String name,double balance,boolean isSalary){
		super(accountNumber,name,balance);
		this.isSalary=isSalary;
	}
	public boolean withdraw(double amount){
		if(isSalary&&amount>0 && getBalance()-amount>=0){
			setBalance(getBalance()-amount);
			return true;
		}
		if(amount>0 && getBalance()-amount>=1500){
			setBalance(getBalance()-amount);
			return true;
		}
		return false;
	}
		public boolean deposit(double amount){
			if(amount>0){
				setBalance(getBalance()+amount);
				return true;
			}
			return false;
		}
		public boolean isSalary(){
			return isSalary;
	}
		public void setSalary(boolean setSalary){
			this.isSalary=isSalary;
			}
		@Override
		public String toString() {
			return "Savings [isSalary=" + isSalary + ", getAccountNumber()=" + getAccountNumber() + ", getName()="
					+ getName() + ", getBalance()=" + getBalance() + "]";
		}
		
}
