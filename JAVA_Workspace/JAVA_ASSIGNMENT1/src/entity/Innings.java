package entity;
//import java.util.*;
	//import java.io.*;
	//import java.lang.Math;
	public class Innings {
		
		 public static void main(String args[])
		 {
		
		        int zeros = 0;
		        int ones = 0;
		        int twos = 0;
		        int threes = 0;
		        int fours = 0;
		        int sixes = 0;
		        float strike_rate = 0;
		        int sum;
		        
		        int[] ar=new int[30];
		        for(int i=0;i<30;i++)
		        {
		        	ar[i]=(int)(Math.random()*7); 
		        }
		        sum=0;
			 for(int i:ar)
			 {
				 sum+=i;
				 
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
			 float sum1;
			 sum1=sum;
			  strike_rate=(sum1/30) *100;
			 System.out.println("zeros   : "+zeros);
			 System.out.println("ones   : "+ones);
			 System.out.println("twos   : "+twos);
			 System.out.println("threes   : "+threes);
			 System.out.println("fours   : "+fours);
			 System.out.println("sixes   : "+sixes);
			 System.out.println("Sum   : "+sum1);
			 System.out.println("Strike rate   : "+strike_rate);
			 
		 }
		}

