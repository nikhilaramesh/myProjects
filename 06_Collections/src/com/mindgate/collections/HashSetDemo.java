package com.mindgate.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	private Set<Integer> numberSet = new HashSet<Integer>();
	public void display(){
		numberSet.add(12);
		numberSet.add(14);
		numberSet.add(16);
		numberSet.add(18);
		numberSet.add(20);
		System.out.println(numberSet);
		

	}
 }
