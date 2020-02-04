package _SpringBoot.BootTest_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao extends JdbcDaoSupport{

	@Autowired
	DataSource datasource;
	
	@PostConstruct
	public void initialized()
	{
		System.out.println("PostCostruct Loaded");
		System.out.println("DBCON"+datasource.toString());
		setDataSource(datasource);
	}
	
	public List<EmployeeBean> getAllEmployees()
	{
		String sql = "SELECT * FROM employee_master";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<EmployeeBean> result = new ArrayList<EmployeeBean>();
		for(Map<String, Object> row:rows){
			EmployeeBean emp = new EmployeeBean();
			emp.setEmpNo((Integer)row.get("employeeid"));
			emp.seteName((String)row.get("name"));
			emp.setSalary((Double)row.get("salary"));
			result.add(emp);
	}
		System.out.println("MYSQL RES: "+result);
		return result;

	}
		public void insertEmployee(EmployeeBean emp)
		{ 
			
			String sql = "INSERT INTO employee_master" +
					"(employeeid,name,salary) VALUES (?, ?,?)" ;
			getJdbcTemplate().update(sql, new Object[]
			{
			emp.getEmpNo(),emp.geteName(),emp.getSalary()
			}
			);
			
		}

		
	

}

