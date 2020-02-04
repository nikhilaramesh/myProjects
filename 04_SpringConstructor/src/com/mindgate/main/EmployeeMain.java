package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee1 = applicationContext.getBean("employee1",Employee.class);
		System.out.println(employee1);
		Employee employee2=applicationContext.getBean("employee2",Employee.class);
		System.out.println(employee2);

	}

}
