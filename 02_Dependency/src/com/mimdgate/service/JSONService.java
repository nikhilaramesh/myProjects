package com.mimdgate.service;

public class JSONService implements NotificationService{

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("message::"+message+"is sent to"+receiver);
	}
	

}
