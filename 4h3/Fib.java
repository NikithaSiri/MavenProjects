import java.util.*;
class Fib
{
public static void main(String args[])
{
int f0=0; 
  int f1=1;
  System.out.print(f1);
  System.out.print(" ");
 for(int i=0;i<5;i++)
{
  
  int f=f0+f1; 
  System.out.print(f);
  System.out.print(" "); 
 f0=f1; //f1=
  f1=f;  //
}
}}