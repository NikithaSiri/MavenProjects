package entity;	
import java.util.*;
	import java.io.*;
	public class ElectricityBill {
	
		  public static void main(String args[])
		  {
			    System.out.println("WELCOME TO ELECTRICITY BILL CALCULATION\n");
			    float std=1.20f;
			    float result=0.0f;
			    char y='y';
			    do {
			    Scanner sc=new Scanner(System.in);
			    System.out.println("ENTER NUMBER OF UNITS");
			    int units=sc.nextInt();
			    if(units<=100)
			    {
			    	  result=units*std;
			    	
			    }
			    else if(units>100 && units<=300)
			    {
			    	 
			    	result+=100*std;
			    	result+=(units-100)*2;
			    	
			    	
			    }
			    else
			    {
			    	result+=100*std;
			    	result+=200*2;
			    	result+=(units-300)*3;
			    }
			    
			    System.out.println("result is -> "+result);
			    
			    System.out.println("IF U WANT TO CONTINUE ENTER y:");
			    y=sc.next().charAt(0);
			    }while(y=='y');
			    
			   // sc.close();
		  }
	}

