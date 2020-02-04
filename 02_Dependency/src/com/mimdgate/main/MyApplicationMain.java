package com.mimdgate.main;

import java.util.Scanner;

import com.mimdgate.pojo.MyApplication;
import com.mimdgate.service.EmailService;
import com.mimdgate.service.JSONService;
import com.mimdgate.service.SMSService;

public class MyApplicationMain {
	public static void main(String[] args) {
		int choice;
		Scanner scan = new Scanner(System.in);
		
		EmailService emailService = new EmailService();
		SMSService smsService = new SMSService();
		JSONService jsonService = new JSONService();
		MyApplication application;
		
		System.out.println("Menu");
		System.out.println("1.SMS Notification");
		System.out.println("2.Email Notification");
		System.out.println("3.JSON Notification");
		
		choice = scan.nextInt();
		switch(choice){
		case 1:
			application = new MyApplication(smsService);
			application.sendNotification("Heya","1243555477");
			break;
		case 2:
			application = new MyApplication(emailService);
			application.sendNotification("Hello","nik13@yahoo.com");
			break;
		case 3:
			application = new MyApplication(jsonService);
			application.sendNotification("key:value","124.355.54.77");
			break;

		}

	}
}
