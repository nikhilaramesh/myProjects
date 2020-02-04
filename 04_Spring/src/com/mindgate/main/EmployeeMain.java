package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("1.");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("2.");
		Employee employee = applicationContext.getBean("employee",Employee.class);
		Employee employee2 = applicationContext.getBean("employee",Employee.class);
		Employee employee3 = applicationContext.getBean("employee",Employee.class);
		Employee employee4 = applicationContext.getBean("employee",Employee.class);
		System.out.println("3.");
		System.out.println(employee);
		System.out.println(employee.hashCode());
		System.out.println(employee2);
		System.out.println(employee2.hashCode());
		System.out.println(employee3);
		System.out.println(employee3.hashCode());
		System.out.println(employee4);
		System.out.println(employee4.hashCode());
		System.out.println("4.");
		System.out.println("Nikhi here!");

	}

}
