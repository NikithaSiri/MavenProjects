import java.util.*;
class Arm
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
 int n=sc.nextInt();
 int temp=n;
int sum=0;
 while(n>0)
 {
  int m = n%10; //m=3 ,m=5,m=1
  
  sum=sum+(m*m*m); //s=0+27,n=15,s=27+125=152,n=1,152+1=153,
  n=n/10;
}
if(temp==sum)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not Armstrong"); 
}}
}