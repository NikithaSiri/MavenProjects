 #include<iostream>
using namespace std;
int main(void)
{
 float a=22,b=7;
 double c=22,d=7;
 long double e=22,f=7;
 int i,n;
 cout<<"Enter the precision of PI-"<<endl;
 cin>>n;
 cout.setf(ios::fixed);
 cout.setf(ios::showpoint);
 for(i=1;i<=n;i++)
 {
 cout.precision(i);
 
 cout<<" PI ="<<(a/b)<<endl;
 }
 cout<<"\n";
 for(i=1;i<=n;i++)
 {
 cout.precision(i);
 
 cout<<" PI ="<<(c/d)<<endl;
 }
 cout<<"\n";
 for(i=1;i<=n;i++)
 {
 cout.precision(i);
 
 cout<<"pi ="<<(e/f)<<endl;
 }
 
}
