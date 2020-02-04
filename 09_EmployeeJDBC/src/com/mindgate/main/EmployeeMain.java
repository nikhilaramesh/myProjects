package com.mindgate.main;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee(102,"Nik",1234);
		EmployeeDAO employeeDAO = new EmployeeDAO();
	
		if(employeeDAO.addEmployee(employee))
			System.out.println("Added successfully!");
		else
			System.out.println("Failed to Add");
		
		
	    employee = employeeDAO.getEmployee(101);
		System.out.println(employee);
		
		System.out.println("Updating employee salary");
		employeeDAO.updateEmployeeSalary(102, 8000);
		employee = employeeDAO.getEmployee(102);
		System.out.println(employee);

		System.out.println("Deleting employee :: 0");

		if (employeeDAO.deleteEmployee(0))
			System.out.println("Delete success");
		else
			System.out.println("Delete failed !!");
	
		}
	}

