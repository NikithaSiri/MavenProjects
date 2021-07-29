/*Create a C++ class by name ‘Rational’, 
representing integer numerator and denominator of 
the given rational number and do the following: 
a) Create 2 rational objects ‘r1’ and ‘r2’ initially with 0/1. 
b) Allow user to update r1 & r2. 
c) Implement a member functions to do addition and 
multiplication of r1, r2. 
d) Implement a friend functions to do subtraction and 
division of r1, r2.*/


#include<iostream>
#include<math.h>
using namespace std;
class rational
{ private:
	float nr;
	float dr;
	public:
		rational(void);
		void setvalues(void);
		int getvalues(int);
		void doaddmul(const rational &);

		friend void dosubdiv(const rational &,const rational &);
		~rational(void);
};
rational::rational(void)
{cout<<"dc"<<endl;
 nr=0;
dr=1;
}
void rational::setvalues(void)
{ cin>>nr>>dr;
}
int rational::getvalues(int flag)
{ if(flag==0)
return nr;
else 
return dr;
}
void rational::doaddmul(const rational &c)
{rational add ,mul;
add.nr=((nr*c.dr)+(c.nr*dr));
add.dr=(dr*c.dr);

cout<<"after addition ="<<add.getvalues(0)<<"/"<<add.getvalues(1)<<endl;

mul.nr=nr*c.nr;
 mul.dr=dr*c.dr;
 cout<<"after multiplication ="<<mul.getvalues(0)<<"/"<<mul.getvalues(1)<<endl;
 
}
 void dosubdiv(const rational &a,const rational &b)
 { rational sub,div;
 sub.nr=((a.nr*b.dr)-(b.nr*a.dr));
sub.dr=(a.dr*b.dr);
cout<<"after subtraction ="<<sub.getvalues(0)<<"/"<<sub.getvalues(1)<<endl;

div.nr=(a.nr*b.dr);
div.dr=(a.dr*b.nr);
cout<<"after division ="<<div.getvalues(0)<<"/"<<div.getvalues(1)<<endl;

}
rational::~rational(void)

{
	cout<<"destructor"<<endl;
}


int main(void)
{ rational r1,r2;
cout<<"r1="<<r1.getvalues(0)<<"/"<<r1.getvalues(1)<<endl;
cout<<"r2="<<r2.getvalues(0)<<"/"<<r2.getvalues(1)<<endl;
cout<<"enter nr and dr of r1="<<endl;
r1.setvalues();
cout<<"enter nr and dr of r2="<<endl;
r2.setvalues();
cout<<"updated r1="<<r1.getvalues(0)<<"/"<<r1.getvalues(1)<<endl;
cout<<" updated r2="<<r2.getvalues(0)<<"/"<<r2.getvalues(1)<<endl;
r1.doaddmul(r2);
dosubdiv(r1,r2);
return 1;
}
























