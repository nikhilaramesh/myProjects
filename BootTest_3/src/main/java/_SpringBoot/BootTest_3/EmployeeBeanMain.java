package _SpringBoot.BootTest_3;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
public class EmployeeBeanMain {
	public static void main(String[] args){
	
	ApplicationContext apc = SpringApplication.run(EmployeeBeanMain.class,args);
	EmployeeJDBC emp = apc.getBean(EmployeeJDBC.class);
	System.out.println("JDBC Insertion::");
    Scanner scanner=new Scanner(System.in);
    System.out.println("EmpNo: ");
	int a=scanner.nextInt();
	System.out.println("EmpName: ");
	String b=scanner.next();
    System.out.println("EmpSalary: ");
    double c=scanner.nextDouble();

  	EmployeeBean p1=new EmployeeBean();
	p1.setEmpNo(a);
	p1.seteName(b);
	p1.setSalary(c);
	emp.insertEmployee(p1);

	emp.getAllEmployees();
 }
}
