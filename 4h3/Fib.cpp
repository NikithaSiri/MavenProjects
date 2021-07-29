#include<stdio.h>

	int main()
	{
		int f0,f1,f,i;
		f0=0;
		f1=1;
		
		printf("%d ",f1);
		for(i=0;i<5;i++)
		{
			f=f0+f1;
			printf("%d ",f);
			f0=f1;
			f1=f;
		}
	}

