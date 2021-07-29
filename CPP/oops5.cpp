#include<iostream>
using namespace std;

int main()
{
    int a,b,num,den,gcd,lcm;
    char key;
    do
    {
	
    cout<<"enter two numbers"<<endl;
    cin>>a>>b;
    num=a;
    den=b;
    while(a!=b)
    {
      if(a>b)
      a=a-b;
      if(b>a)
     b=b-a;
    }
    gcd=a;
    cout<<"GCD="<<gcd<<endl;
    lcm=(num*den)/gcd;
    cout<<"LCM="<<lcm<<endl;
    cout<<"press A to stop the program"<<endl;
    cin>>key;}
    while(key='A');
}
