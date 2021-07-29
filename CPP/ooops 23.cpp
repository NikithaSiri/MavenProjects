/*How do you allocate memory dynamically in C++? 
Illustrate with example program. */
#include<iostream>
using namespace std;
int main()
{
	int **a;
	
	int i,j;
	int m,n;
	cout<<"enter the order-";
	cin>>m>>n;
	a=new int *;
	for (i=0;i<m;i++)
	a[i]=new int[n];
	for (i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i==j)
			a[i][j]=1;
			else 
			a[i][j]=0;
			
			
		}
		
		
	}
	
	cout<<'\n'<<"the identity matrix is--"<<'\n';
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			
			cout<<a[i][j]<<'\t';
		}
	     
	     cout<<'\n';
	     
	}
	
	
	
	
	
	
}
