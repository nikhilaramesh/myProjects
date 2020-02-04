package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInfo {
	String name;
	int age;
	public void acceptDate(){
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter name:");
			name=s.next();
			System.out.println("Enter age:");
			age=s.nextInt();
		}

		catch(InputMismatchException e){
			System.out.println("Invalid Input");
		}
		}
		public void display()
		{
			System.out.println("name::" +name);
			System.out.println("age::" +age);
		}
}


