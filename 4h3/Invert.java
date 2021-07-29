import java.util.*;
import java.util.Scanner;
class Invert
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter rows");
int rows= sc.nextInt();
for(int i=rows;i>=1;i--)
{
 for(int j=rows;j>=rows;j--)
{
  System.out.println("*");
}
System.out.println(" ");
rows=rows-1;
}
System.out.println();
}
}
