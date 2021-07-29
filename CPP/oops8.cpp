#include<iostream>
using namespace std;
long int fact(int );
int main(void)
{
 int n,i,j,k;
 long int term;
 cout<<"Enter n value:";
 cin>>n;
 for(i=0;i<n;i++)
 {
 for(k=0;k<=n-i;k++)
 cout<<" ";
 for(j=0;j<=i;j++)
 {
 term=fact(i)/(fact(j)*fact(i-j));
 cout<<term;
 cout<<" ";
 }
 cout<<endl;
 }
 return 0;
}
long int fact(int m)
{
 if(m==0)
 {
 return 1;
 }
 else
 { return (m*fact(m-1));
 }
}
