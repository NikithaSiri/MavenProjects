package com.lti.entity;
import java.util.*;
public class SecondLargestNum {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	int i;
	for(i=0;i<size;i++)
	{
		
		arr[i]=sc.nextInt();
	}
	for(i=0;i<size;i++)
	{
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr)+" ");
	System.out.println("Second largest number="+arr[size-2]);
}
}
