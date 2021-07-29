#include<stdio.h>
int main()
{
	int n=6;
	int k=-1;
	int i;
	if(n==1)
	{
		printf("%d",k);
		
	}
else
{
	for(i=2;i<=n;i++)
	{
		k=k+3;
	}
	printf("%d",k);
}
return 0;
}
