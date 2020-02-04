package com.mindgate.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	private List<Employee> empList = new ArrayList<Employee>();
	public void addEmployee(Employee e){
		empList.add(e);
	}
	public List<Employee> getAllEmployee() {
		return empList;
	}

	public boolean deleteEmployeeId(int employeeId) {
		for (Employee employee : empList) {
			if (employee.getEmpId() == employeeId) {
				empList.remove(employee);
				return true;
			}
		}
		return false;
	}

	public boolean updateEmployeeName(int employeeId, String newName) {
		for (Employee employee : empList) {
			if (employee.getEmpId() == employeeId) {
				employee.setName(newName);
				return true;
			}
		}
		return false;
	}

	public Employee getEmployee(int employeeId) {
		for (Employee employee : empList) {
			if (employee.getEmpId() == employeeId) {
				return employee;
			}
		}
		return null;
	}
	
}
