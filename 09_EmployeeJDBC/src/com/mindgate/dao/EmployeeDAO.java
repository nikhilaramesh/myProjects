package com.mindgate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String userName = "Mgstrainee";
	private String password = "Mgstrainee";
	private String url = "jdbc:mysql://192.168.1.155:3306/nikhilaDB";
	private String sql;
	private int count;

	public boolean addEmployee(Employee employee){
		sql = "insert into employee_master values(?,?,?)";
		try{
			connection = DriverManager.getConnection(url,userName,password);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,employee.getEmpID());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());
			count = preparedStatement.executeUpdate();
			if(count>0)
				return true;
			return false;
		}catch(SQLException e){
			System.out.println("Exception in Database connectivity");
			System.out.println(e.getMessage());
			return false;
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
		}
	}
	public Employee getEmployee(int empID){
		sql = "select * from employee_master where employeeid=?";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, empID);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmpID(resultSet.getInt("employeeid"));
				employee.setName(resultSet.getString("name"));
				employee.setSalary(resultSet.getDouble("salary"));
				return employee;
			}
		} catch (SQLException e) {
			System.out.println("Exception !!");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return null;
	}
	public boolean updateEmployeeSalary(int empId, double newSalary) {
		sql = "update employee_master set salary = ? where employeeid = ?";

		try {
			connection = DriverManager.getConnection(url, userName, password);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(2, empId);
			preparedStatement.setDouble(1, newSalary);

			count = preparedStatement.executeUpdate();
			if (count > 0)
				return true;
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean deleteEmployee(int employeeid) {
		sql = "delete from employee_master where employeeid=?";

		try {
			connection = DriverManager.getConnection(url, userName, password);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, employeeid);
			count = preparedStatement.executeUpdate();
			if (count > 0)
				return true;
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch 
				} 
			} 
			
		}
	
	
}
