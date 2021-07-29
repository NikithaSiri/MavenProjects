package com.lti.sorting;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//import com.lti.mapdemos.Product;

public class UserApp {
public static void main(String[] args) {
	Employee e1=new Employee(105,"Vijay",40000);
	Employee e2=new Employee(101,"Sanjay",50000);
	Employee e3=new Employee(103,"Jay",60000);
    
	List<Employee> myList= new ArrayList<>();
	myList.add(e1);
	myList.add(e2);
	myList.add(e3);
	System.out.println(myList);
	Collections.sort(myList);
	System.out.println("\n Sort by empId");
	System.out.println(myList);
	
	System.out.println("\n sort by Sal");
	Collections.sort(myList,new EmpSortBySal());
    System.out.println(myList);
}
}
