#include<iostream>
using namespace std;
int main(void)
{
	int n,num,count,k,temp,frequency[50],flag=0,maxCount=0,max,j,i,array[50];
	cout<<"Enter :"<<endl;
	cin>>num;
	temp=num;
	for(i=0;i<10;i++)
	{
		frequency[i]=0;
	}
	while(num!=0)
	{
		k=num%10;
		frequency[k]++;
		num/=10;
	}
	for(i=0;i<10;i++)
	{
	   count=1;
	   for(j=i+1;j<10;j++)
	   {
	   	if(array[j]==frequency[i])
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
