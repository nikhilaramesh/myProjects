package com.mindgate.pojo;

public class Abstract2 extends Abstract1{
	private double amount;
	public Abstract2(){
		System.out.println("Hello");
	}
	public Abstract2(int num1,String name,double amount){
		super(num1,name);
		this.amount=amount;
		System.out.println(num1+" "+name+" "+amount);
	}
}
