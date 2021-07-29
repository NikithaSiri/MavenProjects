import java.util.*;
class Spacepre
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

String s1=sc.nextLine();
String s2=s1.replaceAll("\\s","");
int a=s2.length()-1;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)==' ')
{
System.out.print(" ");
}
else
{
System.out.print(s2.charAt(a));
a--;
}
}
}
}