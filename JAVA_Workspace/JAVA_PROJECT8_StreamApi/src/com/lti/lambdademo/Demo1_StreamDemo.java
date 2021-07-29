package com.lti.lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Demo1_StreamDemo {

	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(new Person("Jay",40), new Person("Vijay",50),new Person("Sanjay",60),new Person("Vinay",60),new Person("Ajay",60));
		List<Person> filteredList=persons.parallelStream().filter(p->p.name.startsWith("V")).collect(Collectors.toList());
	System.out.println(filteredList);
	}
}
