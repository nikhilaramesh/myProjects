package com.mindgate.main;

import com.mindgate.pojo.MyInterface;

public class MyInterfaceMain {
	public static void main(String[] args) {
		MyInterface myInterface = (num1,num2) ->
		{
			return num1+num2;
		};
		double result = myInterface.addition(10.5,10.15);
		System.out.println(result);
	}
}
