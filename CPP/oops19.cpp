/*Demonstrate the concept of array of objects for 
C++ “Complex” class to: 
a) Allow user to enter ‘n’ complex numbers. 
b) Add all complex numbers and display using a member 
function. 
c) Implement a friend to multiply all numbers and 
display in complex form.*/

#include<iostream>
using namespace std;
#define com 10
class complex
{ private:
	int real;
	int img;
	public:
		void setvalues(void);
		int getvalues(int);
		complex doadd(const complex &);
		friend complex domul(const complex &,const complex &);
};
void complex::setvalues(void)
{ cin>>real>>img;
}
int complex::getvalues(int flag)
{if(flag==0)
return real;
else
return img;
}
complex complex::doadd(const complex &c)
{ complex omg;
omg.real=real+c.real;
omg.img=img+c.img;
return omg;
}
complex domul(const complex &c1,const complex &c2)
{complex ans;
   ans.real=(c1.real*c2.real)-(c1.img*c2.img);
   ans.img=(c1.real*c2.img)+(c1.img*c2.real);
   return ans;
}



int main()
{complex c[com];
int i,n;
cout<<"enter n-"<<endl;
cin>>n;
for(i=0;i<n;i++)
{  
cout<<"enter the complex["<<i<<"]="<<endl;
c[i].setvalues();
}
for(i=0;i<n;i++)
cout<<"c["<<i<<"]="<<c[i].getvalues(0)<<"+"<<c[i].getvalues(1)<<"i"<<endl;
complex add;
for(i=0;i<n;i++)
add=add.doadd(c[i]);
cout<<" addition c["<<i<<"]="<<add.getvalues(0)<<"+"<<add.getvalues(1)<<"i"<<endl;
complex mul;
mul=c[0];
for(i=1;i<n;i++)
mul=domul(mul,c[i]);
cout<<" multiplication c["<<i+1<<"]="<<mul.getvalues(0)<<"+"<<mul.getvalues(1)<<"i"<<endl;

}
