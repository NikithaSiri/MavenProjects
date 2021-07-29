import java.util.*;
class Cwords
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
String i,j,c,temp;
System.out.println("enter the string ");
String str=ob.nextLine();
String w[]=str.split();
int l[]=new int[w.length];
for(i=0;i<w.length();i++)
{
l[i]=w[i].length();
}
Arrays.sort(l);
int max=l[w.length-1];
for(int i=1;i<=max;i++)
{
c=0;
for(j=0;j<w.length;j++)
{
if(i==l[j])
{
c++;
}
if(c!=0)
System.out.println(" size "+i+" = "+




















