package com.lti.lambdademo;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();  
		
		list.add(new Person("Mahesh",30));
		list.add(new Person("Ram",40));
		list.add(new Person("Krishna",60));
	
		Consumer<Person> style = (Person p) -> System.out.println(" Name:"+p.getName()+", Age: " +p.getAge());
		list.forEach(style);
	}
}
