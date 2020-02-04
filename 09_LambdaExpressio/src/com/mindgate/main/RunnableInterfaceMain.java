package com.mindgate.main;

import com.mindgate.pojo.RunnableInterface;

public class RunnableInterfaceMain {
 public static void main(String[] args) {
	RunnableInterface run = () -> System.out.println("Hey!!");
	run.run();
}
}
