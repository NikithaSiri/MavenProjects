package com.lti.listdemos;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Demo1 {
	public static void main(String[] args) {
		
		int no=100;
		Integer iobj=new Integer(no); //wrapper classes
		//to convert prim to non prim or vice versa
		int i=iobj.intValue();
		
		List<String> myList = new ArrayList<>();
		//order of insertion is maintained
		//List myList=new ArrayList();
		myList.add("vijay");
		myList.add("ajay");
	//	myList.add(iobj);
		// myList.add(100); //boxing unboxing actomatically happpes=ns with java Integer iobj=new Integer(100);
		//myList.add(null);
		//myList.add(100);
		System.out.println(myList);
		//Collections.sort(myList);
		System.out.println(myList);
	}
	

}
