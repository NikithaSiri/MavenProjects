import java.util.*;
class Fre
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String str=in.nextLine();
String s1=in.nextLine();
if(str.contains(s1))
{
int fre=str.length()-str.replaceAll(s1,"").length();
System.out.println(s1+" "+fre);
}
else
{
System.out.println(s1+" : 0");
}
}
}