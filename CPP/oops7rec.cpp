#include <iostream>
using namespace std;
int fibonacci(int );
int main()
{
 int n , i=0,f;
 char key;
 do 
 {
 
 cout << "Enter the number of terms in the series : ";
 cin >> n;
 cout << "the series is: "<<endl;
 while(i < n) 
 {f=fibonacci(i);
 cout <<" "<< f<<endl;
 i++;
 }
 cout<<"press A to stop"<<endl;
 cin>>key;}
 while(key!='A');
}
int fibonacci(int n) 
{
 if((n==1)||(n==0)) 
 {
 return(n);
 }
 else
 {
 return(fibonacci(n-1)+fibonacci(n-2));
 }
}
