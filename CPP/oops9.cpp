#include <iostream>
using namespace std;
inline long int fact(int m)
{
 if(m==0||m==1)
return 1;
else 
return m*fact(m-1);
}

int main()
{
  int n,p;
  cout<<"Enter a number:";
  cin>>n;
  cout << "factorial of  "<<n<<"is :" << fact(n)<<endl;
  return 0;
 }
