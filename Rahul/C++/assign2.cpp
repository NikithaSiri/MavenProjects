#include<iostream>
using namespace std;
#define num 50
class A
{ private:
 int a[num];
int n;
public: 
void setvalues (void);
void getvalues(void);
A domerge(const A &);
void friend doduplicate(A &);
};

void A::setvalues(void)
{  int i;

cout<<"Enter number of  Elements in the Array: ";
cin>>n;
cout<<"Enter Elements in the Array: ";
   for(i=0;i<n;i++)
   {
   	cout<<"Enter a["<<i<<"]:";
   cin>>a[i];
   }
}
   A A::domerge(const A &s)
   { 
     A ans;
     int i,j,k;
     ans.n=n+s.n;
     for(i=0,j=0;i<n;i++,j++)
     ans.a[j]=a[i];
     for (i=0;i<s.n;i++,j++)
     ans.a[j]=s.a[i];
   return ans;
}
void A::getvalues(void)
{ int i;

for(i=0;i<n;i++)
{cout<<a[i]<<endl;
}
}
void  doduplicate( A &a3)

{ int i,j,k;

for(i=0;i<a3.n;++i)
		for(j=i+1;j<a3.n;)
		{
			if(a3.a[i]==a3.a[j])
			{
				for(k=j;k<a3.n-1;++k)
				a3.a[k]=a3.a[k+1];
					
				--a3.n;
			}
			else
				++j;
		}
	
	cout<<"\n";
	for(i=0;i<a3.n;++i)
		cout<<a3.a[i]<<" ";
}


int main(void)
 {
   A a1,a2,a3;
   a1.setvalues();
   a2.setvalues();
   a3= a1.domerge(a2);
   cout<<"Elements of Array After Merging: "<<endl;
   a3.getvalues();
  cout<<"Data after eliminating duplicate elements:";
  doduplicate(a3);
}
