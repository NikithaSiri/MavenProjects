import java.io.*;
import java.util.*;
class Perfect
{
 public static void main(String args[])
{
int in1=4;
int in2[]=new int[]{9,7,3,12,7};

int in3=14;
int count=0;
for(int i=0;i<=in1;i++)
{
for(int j=1;j<=in1;j++)
{
if(in2[i]+in2[j]==in3) 
{
count=count+1;
}
}
}
System.out.println(count);
}
}
 