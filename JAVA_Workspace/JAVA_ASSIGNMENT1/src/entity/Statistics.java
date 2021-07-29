package entity;
import java.lang.Math;
	import java.io.*;
	import java.util.*;
	public class Statistics {
		public static void main(String args[])
		{
			int zeros = 0;
	        int ones = 0;
	        int twos = 0;
	        int threes = 0;
	        int fours = 0;
	        int sixes = 0;
	        float strike_rate = 0;
	        int sum=0;
	       
	       int[] run=new int[500];
	       int f=0;
	       for(int i=0;i<5;i++)
	       {
	    	   System.out.println("number of balls played in game "+(i+1));
	    	   Scanner sc=new Scanner(System.in);
	    	   int n=sc.nextInt();
	    	   int j;
	    	   for(j=f;j<n+f;j++)
	    	   {
	    		   run[j]=(int)(Math.random()*7);
	    	   }
	    	  f=j;
	    	  
	       }
	       System.out.println("No of balls"+f);
	       for(int i=0;i<f;i++)
	       {
	    	   System.out.println("  runs  ->"+run[i]);
	    	   sum+=run[i];
	    	   if(i==0)
					 zeros++;
				 else if(i==1)
					 ones++;
				 else  if(i==2)
					 twos++;
				 else if(i==3)
					 threes++;
				 else if(i==4)
					 fours++;
				 else if(i==6)
					 sixes++;
				 
	       }
	       float avg=(float)sum/f;
	       strike_rate=avg*100;
	       System.out.println("zeros   : "+zeros);
			 System.out.println("ones   : "+ones);
			 System.out.println("twos   : "+twos);
			 System.out.println("threes   : "+threes);
			 System.out.println("fours   : "+fours);
			 System.out.println("sixes   : "+sixes);
			 System.out.println("Sum   : "+sum);
			 System.out.println("Avg   : "+avg);
			 System.out.println("Strike rate   : "+strike_rate);
	        
	       
			
		}
	}


