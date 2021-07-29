#include<iostream>
using namespace std;
int main(void)
{
	int A[50],array[50],num,i,j,maxCount=0,max,count;
	cout<<"Enter the num digit by digit:"<<endl;
	for(i=0;i<10;i++)
	{
		cout<<"Enter A["<<i<<"]:"<<endl;
		cin>>A[i];
	}
	for(i=0;i<10;i++)
	{
		cout<<A[i]<<endl;
	}

	for(i=0;i<10;i++)
	{
	   count=1;
	   for(j=i+1;j<10;j++)
	   {
	   	if(array[j]==A[i])
	   	{
	   		count++;
	   		if(count>maxCount)
	   		{
	   			max=array[j];
			}
	    }
	   }
	}
	cout<<max;

}
