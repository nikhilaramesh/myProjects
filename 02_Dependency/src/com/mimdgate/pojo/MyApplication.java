package com.mimdgate.pojo;

import com.mimdgate.service.NotificationService;

public class MyApplication {
	private NotificationService service;
	public MyApplication(NotificationService service) {
		this.service = service;
	}
	public void sendNotification(String message, String receiver){
		service.sendMessage(message, receiver);
	}

}
