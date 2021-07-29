package com.lti.demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Demo1 {

	public static void main(String[] args) throws IOException {
		//Two types: checked,unchecked
		//checked-at the time of compilation
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();    //Before scanner people used to read inputs from this, its faster than scanner
		int  k=1000;
		
		try
		{
			int i=0;
			//unchecked at the time of compilation //runtime
			int j=500/i;
			System.out.println("j: "+j);
		}
		catch(ArithmeticException e)
		{
			System.out.println("please check,i value is zero");
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		}
		System.out.println("k: " +k);
	}
}
