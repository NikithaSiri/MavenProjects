package com.lti.lambdademo;

public class TestStream {

	public static void main(String[] args) {
		
//MaxFinderImpl mf=new MaxFinderImpl();
//double max= mf.maximum(400,200);
//System.out.println(max);
		
		
	MaxFinder mf=(num1,num2)->num1>num2 ? num1:num2;
    double max=mf.maximum(1000, 5000);
    System.out.println(max);
	}
}
//lambdas implement function interfaces by own
//implements anonymous classes
//faster
//functional interfaces
//Streams very well / designed to wrok with streams
//------------------------
//Streams:
//input, output streams