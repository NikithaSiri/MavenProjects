import java.util.*;
class TwinPrimes{
	static boolean checkPrime(int number)
		{
			int i;
			int m=number/2;
			int flag=0;
			if(number==0 || number==1)
					{
						System.out.println("invalid");
						return false;
					}
					else 
					{   
						for(int i=0;i<m;i++)
						{
							if(number%i==0)
							{
		                         			flag=1;
								return false;
							}
							
						}			
					if(flag==0)
					{
					return true;
					}
					}
		return false;
		}
	static boolean checkTwinPrimeNumber(number1,number2)
	{
		if(checkPrime(number1) && checkPrime(number2) &&Math.abs(number1-number2)==2)
		{
			return true;
		}
	}
public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	int startrange=sc.nextInt();
	int endRange=sc.nextInt();
	for(int i=startrange;i<endRange;i++)
		{
			if(checkTwinPrimeNumber(i,(i+2)))
			{
				System.out.printf("(%d, %d)\n",i,i+2);
			}
		}
}
}