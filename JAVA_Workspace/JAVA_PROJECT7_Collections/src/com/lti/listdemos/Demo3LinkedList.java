package com.lti.listdemos;
import java.util.LinkedList;
import java.util.ListIterator;
public class Demo3LinkedList {

	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		System.out.println(lst);
	    lst.addFirst("F");
	    System.out.println(lst);
	  
	    ListIterator itr=lst.listIterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    		while(itr.hasPrevious())
	    		{
	    			System.out.println(itr.previous());
	    		}
	}
}
