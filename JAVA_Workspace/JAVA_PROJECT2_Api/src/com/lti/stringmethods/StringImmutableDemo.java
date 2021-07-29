package com.lti.stringmethods;

public class StringImmutableDemo {
public static void main(String[] args) {
	 String s1="Hello";
	 String s2="World";
	 //concatenation immutability
	 //String classes are in-built
	 String s3=s1+s2;
	 System.out.println(s3);
	 //Why strings are immutable- can't chge modify
	 System.out.println(s1);
	 String s4=s1.concat(s2);
	 System.out.println(s4);
    System.out.println("****String Buffer****");
	 StringBuffer sb=new StringBuffer("Hello");
	 sb.append("World");
	 System.out.println(sb);
	 //string buffer drawback is thread safe/synchronized-->if someone is editing you cannot make operation ---> slow in performance
	//string builder are faster in performance and are unsynchronized
	 StringBuilder sd=new StringBuilder("Hello");
	 sd.append("Word1");
	 System.out.println(sd);
}
}
