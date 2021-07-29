/*Write a C++ program to maintain a 2D Matrix of 
integer at runtime and perform the matrix 
multiplication using pointers.*/
#include<iostream>
using namespace std;
int main()
{
	
	int **A=NULL;
	int **B=NULL;
	int m,p,q,n,i,j,k,sum=0;
	cout<<"enter the order of matrix 1- "<<endl;
	cin>>m>>n;
	 A=new int*;
	 for(i=0;i<m;i++)
	 A[i]=new int[n];
	 if(NULL==A)
	 {
	 	cout<<"object creation failed";
	 	exit(0);
	 	
	 }
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			cout<<"enter a["<<i<<"]["<<j<<"]-";
			cin>>A[i][j];
		}
	}
	cout<<"enter the order of matrix 2- "<<endl;
	cin>>p>>q;
	B=new int*;
	 for(i=0;i<p;i++)
	 B[i]=new int[q];
	 if(NULL==B)
	 {
	 	cout<<"object creation failed";
	 	exit(0);
	 	
	 }
	
	
	for(i=0;i<p;i++)
	{
		for(j=0;j<q;j++)
		{
			cout<<"enter b["<<i<<"]["<<j<<"]-";
			cin>>B[i][j];
		}
	}
	
	if(n!=p)
	 {
	 	cout<<"multiplication is not possible";
	 	exit(0);
	 	
	 }
	 
	 int **M=NULL;
	 
	 M=new int*;
	 for(i=0;i<m;i++)
	 M[i]=new int[q];
	 if(NULL==M)
	 {
	 	cout<<"object creation failed";
	 	exit(0);
	 	
	 }
	 
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<q;j++)
		{   
		    sum=0;
			for(k=0;k<n;k++)
			{
			sum=sum+A[i][k]*B[k][j];	
			
			
			}
		
		M[i][j]=sum;
		}
		
	}
	cout<<'\n'<<"The Product matrix is-"<<endl;
	for(i=0;i<m;i++)
	{
		for(j=0;j<q;j++)
		{
			cout<<M[i][j]<<'\t';
		}
		cout<<'\n';
	}
}
 
