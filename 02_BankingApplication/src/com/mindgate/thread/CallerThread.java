package com.mindgate.thread;

public class CallerThread implements Runnable{
	String message;
	Call call;
	public CallerThread(String message,Call call){
		this.message=message;
		this.call=call;
		Thread thread = new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		call.getMessage(message);
	}
}
