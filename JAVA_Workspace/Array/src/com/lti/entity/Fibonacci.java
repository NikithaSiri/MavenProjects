package com.lti.entity;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i= 1; i<= n; i++){
		System.out.print(fib(i)+" ");
	}
	}

		public static int fib(int n)
		{
			if(n<=1)
			{
				return n;
			}
			else 
			{
				
				return (fib(n-1)+fib(n-2));
			}
		}
}

	
	 

