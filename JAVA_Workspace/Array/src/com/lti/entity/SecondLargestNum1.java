package com.lti.entity;

import java.util.*;

public class SecondLargestNum1 {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	int i;
	int largest=0;
	int secondLargest=0;
	for(i=0;i<size;i++)
	{
		System.out.println("Enter elements into array");
		arr[i]=sc.nextInt();
	}
	/*for(i=0;i<size;i++)
	{
	System.out.print(arr[i]+" ");
	}*/
	System.out.println();
    Arrays.sort(arr);
	//System.out.println(Arrays.toString(arr)+" ");
	
	for(i=0;i<size;i++)
	{
		if(arr[i]>largest)
		{
			secondLargest=largest;
			largest=arr[i];
		}
		else if(arr[i]>secondLargest)
		{
			secondLargest=arr[i];
		}
		
	}
	System.out.printf("Sorted Array is "+Arrays.toString(arr));
	System.out.println();
	System.out.println("Second largest number is "+secondLargest);
	}
	
}
