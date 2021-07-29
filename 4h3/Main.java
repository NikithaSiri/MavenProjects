import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		System.out.println(Nthnum(input1,input2,input3));
	}
	public static int Nthnum(int input1,int input2,int input3)
	{
		if(input3==1)
		{
			return input1;
		}
		else if(input3==2)
			return input2;
		int sum=(input1+input2)+(input1^input2);
		if(input3==3)
				return sum;
		int sum1=input1+input2;
		for(int i=4;i<=input3;i++)
		{
				input1=input2;
				input2=sum;
				sum=sum+sum1+(input1^input2);
				sum1=sum1+sum;
		}
		return sum;
	}
}