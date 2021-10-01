package com.lti.debug.demo;

public class TestDebug {

		public static int add(int x, int y) {
			int sum = x + y;
			return sum;
		}

		public static void main(String[] args) {

			int i = 10;
			int j = 20;
			System.out.println(i + " " +  j);
			
			int res = 0;
				
			res = add(i, j);
			
			int a = 30;
			int b = 0;
			b = res + b;
			System.out.println(b);
		}

	}


