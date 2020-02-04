package com.mindgate.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	private List<String> nameList = new ArrayList<String>();
	public void display(){
		nameList.add("Nik");
		nameList.add("Siju");
		nameList.add("Anju");
		nameList.add("Mathew");
		nameList.add("Ann");
		nameList.add("Siju");
		System.out.println(nameList);
		System.out.println("size::" +nameList.size());
		nameList.add("Matty");
		System.out.println("size::" +nameList.size());
		nameList.remove(1);
		System.out.println("size::" +nameList.size());
		System.out.println(nameList);
	}
}
