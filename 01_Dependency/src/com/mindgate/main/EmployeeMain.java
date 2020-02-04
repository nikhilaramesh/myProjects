package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Address add = new Address("Anna Salai","Chennai","Tamil Nadu");
		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("Meenu Kutty");
		emp.setSalary(20000);
		emp.setAddress(add);
		System.out.println(emp);
	}
}
