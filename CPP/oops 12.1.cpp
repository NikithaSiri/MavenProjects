#include<iostream>
using namespace std;
void doswap(int*,int*);
int main()
{ int a,b,swap;
cout<<"enter two numbers"<<endl;
cin>>a>>b;
doswap(&a,&b);
cout<<"after swapping :"<<a<<" "<<b<<endl;
}
void doswap(int*a,int*b)
{ int temp;
temp=*a;
*a=*b;
*b=temp;
}
