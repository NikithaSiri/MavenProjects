/*Create a C++ class by name ‘Complex’, 
representing real and imaginary parts of the 
complex number and do the following: 
a) Create 2 objects ‘c1’ and ‘c2’ initially with 0+0i. 
b) Allow user to update c1 & c2. 
c) Member function to do add and subtraction of c1, c2. 
d) Implement a friend to multiply & divide: c1 with c2*/



#include<iostream>

using namespace std;
class complex
{ private:
	float real;
	 float img;
	public:
		complex(void);
		void setvalues(void);
		float getvalues(int);
		void doaddsub(const complex &);
		
		friend void domuldiv(const complex &,const complex &);
};
complex::complex(void)
{cout<<"dc"<<endl;
 real=0;
img=0;
}
void complex::setvalues(void)
{ cin>>real>>img;
}
float complex::getvalues(int flag)
{ if(flag==0)
return real;
else 
return img;
}
void complex::doaddsub(const complex &c)
{ complex add,sub;
add.real=real+c.real;
add.img=img+c.img;
sub.real=real-c.real;
sub.img=img-c.img;
cout<<"after addition="<<add.getvalues(0)<<"+"<<add.getvalues(1)<<"i"<<endl;
cout<<"after subtraction="<<sub.getvalues(0)<<"+"<<sub.getvalues(1)<<"i"<<endl;
}
 void domuldiv(const complex &a,const complex &b)
{ complex mul,div;
mul.real= (a.real*b.real)-(a.img*b.img);
mul.img=(a.real*b.img)+(a.img*b.real);   //ac-bd,ad+bc
div.real=(float)(((a.real)*(b.real))+((a.img)*(b.img)))/(((b.real*b.real))+((b.img*b.img)));  //ac+bd/c^2+d^2
div.img=(float)(((b.real)*(a.img))-((a.real)*(b.img)))/(((b.real*b.real))+((b.img*b.img)));   //cb-ad/c^2+d^2
cout<<"after multiplication="<<mul.getvalues(0)<<"+"<<mul.getvalues(1)<<"i"<<endl;
cout<<"after division="<<div.getvalues(0)<<"+"<<div.getvalues(1)<<"i"<<endl;
}

int main(void)
{ complex c1,c2;
cout<<"c1="<<c1.getvalues(0)<<"+"<<c1.getvalues(1)<<"i"<<endl;
cout<<"c2="<<c2.getvalues(0)<<"+"<<c2.getvalues(1)<<"i"<<endl;
cout<<"enter real and img of c1="<<endl;
c1.setvalues();
cout<<"enter real and img of c2="<<endl;
c2.setvalues();
cout<<"updated c1="<<c1.getvalues(0)<<"+"<<c1.getvalues(1)<<"i"<<endl;
cout<<" updated c2="<<c2.getvalues(0)<<"+"<<c2.getvalues(1)<<"i"<<endl;
c1.doaddsub(c2);
domuldiv(c1,c2);
return 1;
}








