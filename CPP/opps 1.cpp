#include<iostream>
using namespace std;
int a=8;
int main(void)
{
 int a=9,sum=0;
 sum=a+::a;
 cout<<"sum is "<<sum;

}
