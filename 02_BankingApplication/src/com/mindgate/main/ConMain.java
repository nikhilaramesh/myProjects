package com.mindgate.main;

import com.mindgate.pojo.Con1;
import com.mindgate.pojo.Con2;

public class ConMain {
	public static void main(String[] args) {
		Con1 a = new Con1();
		System.out.println("---------------");
		Con1 b = new Con1(10,20);
		System.out.println("---------------");
		Con2 c = new Con2();
		System.out.println("---------------");
		Con2 d = new Con2(10,20);
		System.out.println("---------------");
		Con2 e = new Con2(10);

	}
}
