package com.mindgate.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mindgate.pojo.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person person1 = new Person("Nikhila",22);
		Person person2 = new Person("Nikhi",23);
		Person person3 = new Person("Nik",25);
		Person person4 = new Person("Nikhil",26);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		System.out.println(personList);
		System.out.println("___________________________________");
		for (Person temp : personList) {
			System.out.println(temp);
		}
		System.out.println("____________________________________");

	}
}
