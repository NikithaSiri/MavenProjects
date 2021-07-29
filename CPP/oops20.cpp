/*Demonstrate the concept of friend class by 
creating two classes: a ‘complex’ class to represent 
a complex number ‘a+ib’ and a ‘rational’ class to 
represent a rational number (c/d). Using a function 
print whose magnitude is higher among a given 
complex object and rational objects.*/

#include<iostream>
#include<math.h>
using namespace std;
class rational;
class complex
{ private:
	int real;
	int img;
	public:
	
		void setvalues(void);
		int getvalues(int);
		
		
		friend void comp(const complex &,const rational &);
};
class rational
{ private:
	float nr;
	float dr;
	public:
	
		void setvalues(void);
		int getvalues(int);
		friend void comp(const complex &,const rational &);
};
void complex::setvalues(void)
{cin>>real>>img;
}
int complex::getvalues(int flag)
{ if(flag==0)
return real;
else 
return img;
}
void rational::setvalues(void)
{ 
 cin>>nr>>dr;
}
int rational::getvalues(int flag)
{ if(flag==0)
return nr;
else 
return dr;
}
void comp(const complex &c,const rational &r)
{ float m1,m2;
m1=sqrt(c.real*c.real+c.img*c.img);
m2=r.nr/r.dr;
if (m2<0)
{
m2=m2*-1;
}

if(m1>m2)
cout<<"complex has larger magnitude"<<endl;
else if(m1<m2)
cout<<"rational has larger magnitude"<<endl;
else 
cout<<"both are equal"<<endl;
}

int main ()
{ complex c;
cout<<"Enter real and img-";
c.setvalues();
cout<<"c="<<c.getvalues(0)<<"+"<<c.getvalues(1)<<"i"<<endl;
rational r;
cout<<"Enter num and den-";
r.setvalues();
cout<<"r="<<r.getvalues(0)<<"/"<<r.getvalues(1)<<endl;
comp(c,r);
return 1;
}


























