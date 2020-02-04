package com.mindgate.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstMain {
	public static void main(String args[])
	{
		ApplicationContext apc = SpringApplication.run(SpringBootFirstMain.class,args);;
		SpringBootFirst obj = apc.getBean(SpringBootFirst.class);
		obj.display();
	}

}
