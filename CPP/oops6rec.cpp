#include<iostream>
using namespace std;
long int fact (int);
int main(void)
{
   int n;
   long int fac;
char key;
do{
cout<<"enter n"<<endl;
cin>>n;
fac=fact(n);
cout<<"factorial of n is "<<fac<<endl;
cout<<"enter A to quit"<<endl;
cin>>key;
}while(key!='A');
}
long int fact (int m)
{
if(m==0||m==1)
return 1;
else 
return m*fact(m-1);
}
