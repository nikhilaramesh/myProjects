package _SpringBoot.BootTest_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpServiceMain implements CommandLineRunner 
{
	@Autowired
	 EmpService serv1;
	public static void main(String[] args) 
	{
		SpringApplication.run(EmpServiceMain.class, args);
		System.out.println("Spring Boot Main Loaded!!");
	}

		
		public void run(String... arg1) throws Exception 
		{
			System.out.println("CL Runner Loaded!!");
			if (arg1.length > 0) {
	            System.out.println("Program Arguments: "+serv1.getName1(arg1[0].toString()));
	        } else {
	            System.out.println("Default Arguments(From prop file): " +serv1.getName());
	        }		
		
		}

		
	}

	


