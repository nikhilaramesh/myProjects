package com.Mindgate.Pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeePojo 
{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	@Autowired
	private AddressPojo addressPojo;
	
	public EmployeePojo() {
		// TODO Auto-generated constructor stub
	}

	public EmployeePojo(int employeeId, String employeeName, double employeeSalary, AddressPojo addressPojo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.addressPojo = addressPojo;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public AddressPojo getAddressPojo() {
		return addressPojo;
	}

	public void setAddressPojo(AddressPojo addressPojo) {
		this.addressPojo = addressPojo;
	}

	@Override
	public String toString() {
		return "EmployeePojo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
}
