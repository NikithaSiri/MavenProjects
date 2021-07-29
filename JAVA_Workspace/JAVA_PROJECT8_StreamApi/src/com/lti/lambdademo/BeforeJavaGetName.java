package com.lti.lambdademo;

import java.util.Arrays;
import java.util.List;

public class BeforeJavaGetName {

	public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Jay", 30),
                new Person("Vijay", 20),
                new Person("Sanjay", 40)
        );

        Person result = getStudentByName(persons, "Jay");
        //result.setName("SANJEEV");value get reflected
        System.out.println(result);

    }

    private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }

	
}