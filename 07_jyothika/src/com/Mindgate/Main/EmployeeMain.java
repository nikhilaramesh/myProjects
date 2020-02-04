package com.Mindgate.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Mindgate.Pojo.EmployeePojo;

public class EmployeeMain 
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
		EmployeePojo employeePojo=applicationContext.getBean("employeePojo",EmployeePojo.class);
		System.out.println(employeePojo);
	}
}
