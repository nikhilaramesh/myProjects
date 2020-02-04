package com.mindgate.main;

import com.mindgate.thread.ThreadOne;

public class ThreadOneMain {
	public static void main(String[] args) {
		System.out.println("Starting main");
		ThreadOne one = new ThreadOne();
		System.out.println("Thread object is created");
		System.out.println("calling run()");
		one.start();
		System.out.println("Main ends");
		for (int i = 0; i < 10; i++) {
			System.out.println("Main::" +i);
		}
	}
}
