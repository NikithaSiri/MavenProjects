#include<stdio.h>
int main( )
{
	int sum=0;
	int n;
	printf("enter the number=");    
scanf("%d",&n);    
	int m;
	int temp=n;
	while(n>0)
	{
		m=n%10;
		sum=sum+(m*m*m);
		n=n/10;
		
	}
	if(temp==sum)
	{
	printf("Armstrong");
	}
	else
	{
	printf("not armstrong");
    } 
	printf("%d",sum);
	return 0;
}
