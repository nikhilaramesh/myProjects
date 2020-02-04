package com.mindgate.thread;

public class Call {
	public synchronized  void getMessage(String message){
		System.out.print("[");
		System.out.print(message);
		System.out.println("]");
	}
}
