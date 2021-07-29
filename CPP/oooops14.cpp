/*Demonstrate the concept of ADT class to achieve 
procedural abstraction by creating a class by name 
‘Complex’ representing a complex number system 
with floating point real and imaginary values. Use 
appropriate mutator and accessor. Create one 
complex object and justify what is static binding.
*/

#include<iostream>
using namespace std;
class Complex
{ private:
	float real;
	float img;
	public:
		Complex(void);
		Complex(float,float);
		Complex(const Complex &);
		void setValues(void); 
           void getValues(void);
           ~Complex(void);
};
Complex::Complex(void)
{
cout<<"dc"<<endl;
 real=0;
img=0;
}
Complex::Complex(float a ,float b)
{ 
cout<<"pc"<<endl; 
real=a;
img=b;
}
Complex::Complex(const Complex &c)
{ 
cout<<"cc"<<endl; 
 real=c.real;
img=c.img;
}
Complex::~Complex(void)
{ 
cout<<"dd"<<endl;
}



void Complex::setValues(void)
 {
   cout<<"Enter Real number-"<<endl;
   cin>>real; 
   cout<<"Enter imag number-"<<endl;
   cin>>img;
 }
 void Complex::getValues(void)
 {
   cout<<real<<"+"<<img<<"i"<<endl; 
 }
 int main(void)
 {
   Complex c1;
   c1.getValues();
   Complex c2;
   cout<<"Enter  Complex Number-"<<endl;
   c2.setValues();
   cout<<"C1=";
   c2.getValues();
   Complex c3(2,4);
   c3.getValues();
   Complex c4(c2);
   c4.getValues();   
   }
 
 
 
 
 
 
 
 
 
