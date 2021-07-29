#include<iostream>
using namespace std;
int main()
{
	int n,r,row,space,ncr;
	cout<<"Enter row:"<<endl;
	cin>>row;
	for(n=0;n<row;n++)
	{
		for(space=1;space<row-n;space++)
		{
			cout<<" ";
		}
		for(r=0;r<=n;r++)
		{
			if(n==0||r==0)
			{
				ncr=1;
				cout<<"*"<<ncr;			
			}
			else
			{
				ncr=ncr*(n-r+1)/r;
				cout<<"*"<<ncr;
			}
		}
		cout<<endl;
	}
	return 0;
}
