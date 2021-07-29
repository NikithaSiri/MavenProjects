
  
import java.util.*;
class Palin
{
public static void main(String args[])
{
	String s="madame";
        int l=s.length();
        String temp=s;
        String rev="";
        for(int i=l-1;i>=0;i--)
        {
          rev=rev+s.charAt(i);
         }
   
       
if(s.equals(rev))
{
   System.out.println("Palindrome");
}
else
{ 
System.out.println("not P");
}
}  
}