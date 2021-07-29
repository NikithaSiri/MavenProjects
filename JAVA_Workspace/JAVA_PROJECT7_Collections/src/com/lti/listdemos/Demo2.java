package com.lti.listdemos;
import java.util.ArrayList;
import java.util.List;
public class Demo2 {
public static void main(String[] args) {
	
	List<Student> myList=new ArrayList<>();
	//List myList=new ArrayList();
	
	Student s1=new Student(101,"Jay",1000);
	Student s2=new Student(102,"Vijay",2000);
	Student s3=new Student(103,"Sanjay",3000);

	//Book b1= new Book(1111,"Java",2000);
	myList.add(s1);
	myList.add(s2);
	myList.add(s3);
	//myList.add(b1);
	myList.add(s2);
   
	System.out.println(myList);
	System.out.println("*****");
	myList.remove(s2);
	System.out.println(myList);
	//hold heterogenous objects
	//dynamically grows
	//easy and simple methods -operations
	//duplicate objects allowed

}
}
