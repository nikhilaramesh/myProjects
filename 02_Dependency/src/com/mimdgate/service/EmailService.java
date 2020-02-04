package com.mimdgate.service;

public class EmailService implements NotificationService{
	public void sendMessage(String message,String receiver){
		System.out.println("message::"+message+"is sent to"+receiver);
	}


}
