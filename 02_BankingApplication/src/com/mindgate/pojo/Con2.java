package com.mindgate.pojo;

public class Con2 extends Con1{
	public Con2(){
		System.out.println("This is constructor");
	}
	public Con2(int num2,int num3){
		super(num2,num3);
		System.out.println("This is another constructor");
	}
	public Con2(int num2){
		System.out.println("This is just a constructor");
	}
}
