package _SpringBoot.BootTest_7;

import org.springframework.stereotype.Component;

@Component
public class EmployeePojo {
	int empNo;
	String eName;
	double salary;
	public int getempNo() {
		return empNo;
	}
	public void setempNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() 
	{
		return empNo + " "+eName+ " "+salary ;
	}

	
}
