package com.mindgate.thread;

public class ThreadOne extends Thread{
	public void run(){
		System.out.println("we are in thread one");
		for(int i=0;i<10;i++){
			System.out.println("thread one::" +i);
		}
	}
	

}
