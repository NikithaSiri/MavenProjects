#include <iostream> 
using namespace std; 
int main()
{ 
 int val1=0,val2=1,val3,i,n; 
 char key;
 do
 {
 
 cout<<"Enter the number of elements: "; 
 cin>>n; 
 cout<<val1<<" "<<val2<<" "<<endl; 
 for(i=2;i<n;++i) 
 { 
 val3=val1+val2; 
 cout<<val3<<" "; 
 val1=val2; 
 val2=val3; 
 } 
 cout<<"press A to stop"<<endl;
 cin>>key;}
 while(key!='A');
 
}
