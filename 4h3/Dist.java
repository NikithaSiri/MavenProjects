import java.util.*;
class Dist
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String str=sc.nextLine();
String temp="";
int count=0;
char ch3=' ';
int big=0;
for(int i=0;i<str.length();i++)
{
char c1=str.charAt(i);
for(int j=i;j<str.length();j++)
{
char c2=str.charAt(j);
 if(c1==c2 && temp.indexOf(c1)==-1)
{
count++;
}
}
if(temp.indexOf(c1)==-1)
{
temp=temp+c1;
if(count>big)
{
big=count;
ch3=c1;
}
count=0;
}
}
if(ch3==' ')
{
System.out.println("max char is space : "+big);
}
else
{
System.out.println(ch3+" is max count "+big+" times "); 
}
}
}