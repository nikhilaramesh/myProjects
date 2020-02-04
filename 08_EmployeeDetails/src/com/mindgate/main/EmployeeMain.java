package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.pojo.EmployeeDAO;

public class EmployeeMain {
	public static void main(String[] args) {
		int choice;
		int empId;
		String name;
		double salary;
		String userChoice;
		Scanner scanner = new Scanner(System.in);
		EmployeeDAO employeeDAO = new EmployeeDAO(); 
		boolean loop = true;
		while (loop) {

			System.out.println(" 1. Add Employee\n 2. Update Salary \n 3. Delete Employee \n 4. Print Single Employee");
			System.out.println("Please enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Employee Id:");
				empId = scanner.nextInt();
				System.out.println("Enter the Employee Name:");
				name = scanner.next();
				System.out.println("Enter employee's salary:");
				salary = scanner.nextDouble();
				Employee emp = new Employee(empId, name, salary);
				employeeDAO.addEmployee(emp);
				System.out.println("Stored Sucessfully");
				System.out.println(employeeDAO.getAllEmployee());
				break;
			case 2:
				System.out.println("Enter the Employee Id:");
				empId = scanner.nextInt();
				System.out.println("Enter the Employee Name:");
				name = scanner.next();
                if (employeeDAO.updateEmployeeName(empId, name))
					System.out.println("Updated sucessfully");
				else
					System.out.println("Employee not found");
				System.out.println(employeeDAO.getAllEmployee());
				break;

			case 3:
				System.out.println("Enter the Employee Id:");
				empId = scanner.nextInt();
				if (employeeDAO.deleteEmployeeId(empId))
					System.out.println("Delete Successfully");
				else
					System.out.println("Not Deleted");
				System.out.println(employeeDAO.getAllEmployee());
				break;

			case 4:
				System.out.println("Enter the Employee Id:");
				empId = scanner.nextInt();
				if (employeeDAO.getEmployee(empId) != null)
					System.out.println(employeeDAO.getEmployee(empId));
				else
					System.out.println("Emplyee not found");

				System.out.println(employeeDAO.getAllEmployee());
				break;
			default:
				System.out.println("Invalid choice");
				System.out.println(employeeDAO.getAllEmployee());
				break;

			}
			System.out.println("Do you Want contine (Y/N)");
			userChoice = scanner.next();
			if (userChoice.equalsIgnoreCase("n")) {
				loop = false;
			}
		
	}
}
