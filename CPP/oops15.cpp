/*Demonstrate the concept of constructor 
overloading for a complex number class, ‘Complex’ 
with real and imaginary integer data items. Create 
3 complex objects C1 with default (0+0i), C2 with (-
5+7i) and allow the user to change the values of C1. 
Using suitable constructor call get this updated C1 
into C3. */

#include<iostream>
using namespace std;
class complex
{ private:
	int real;
	int img;
	public:
		complex(void);
		complex(int,int);
		complex(const complex &);
		void setvalues(void);
		int getvalues(int);
		~complex(void);
};
complex::complex(void)
{ cout<<"dc"<<endl;
real=0;
img=0;
}
complex::complex(int a ,int b)
{ cout<<"pc"<<endl; 
real=a;
img=b;
}
complex::complex(const complex &c)
{ cout<<"cc"<<endl; 
 real=c.real;
img=c.img;
}
complex::~complex(void)
{ cout<<"dd"<<endl;
}
void complex::setvalues(void)
{ cin>>real>>img;
}
int complex::getvalues(int flag)
{ if (flag==0)
return real;
else 
return img;
}
int main()
{complex c1;
cout<<"c1="<<c1.getvalues(0)<<"+"<<c1.getvalues(1)<<"i"<<endl;

cout<<"enter real and img of the complex to update c1 :"<<endl;
c1.setvalues();
complex c3(c1);
complex c2(5,7);
cout<<"c2="<<c2.getvalues(0)<<"+"<<c2.getvalues(1)<<"i"<<endl;
cout<<"updated c1 into c3="<<c3.getvalues(0)<<"+"<<c3.getvalues(1)<<"i"<<endl;

return 1;
}




























