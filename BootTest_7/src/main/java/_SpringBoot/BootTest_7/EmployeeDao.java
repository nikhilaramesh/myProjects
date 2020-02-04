package _SpringBoot.BootTest_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	String SQL = "select * from employee_master";
	
	public List<EmployeePojo> isData() 
	{
		List<EmployeePojo> employee = new ArrayList<EmployeePojo>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);
		for (Map<String, Object> row : rows) {
			EmployeePojo employeePojo = new EmployeePojo();
			employeePojo.setempNo((Integer)row.get("employeeid"));
			employeePojo.seteName((String)row.get("name"));
			employeePojo.setSalary((Double)row.get("salary"));
			employee.add(employeePojo);
		}
		return employee;
	}
	 public int delete1(int id)
	 {    
	        String sql="delete from employee_master where employeeid="+id+"";    
	        return jdbcTemplate.update(sql);    
	 }    


}
