package _SpringBoot.BootTest_3;

public class EmployeeBean {
	int empNo;
	String eName;
	double salary;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
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
	@Override
	public String toString() {
		return "EmployeeBean [empNo=" + empNo + ", eName=" + eName + ", salary=" + salary + "]";
	}
	

}
