#include<iostream>
using namespace std;
class complex
{
	private:
		float real;
		float img;
	public:
		void setValues(void);
		complex operator+(const complex &);
		complex operator*(const complex &);
		float getValues(int flag);
		void operator-(void);
		void operator++(void);
};
void complex::setValues(void)
{
	cin>>real>>img;
}
float complex::getValues(int flag)
{
	if(flag==0)
	return real;
	if(flag==1)
	return img;
}
complex complex::operator+(const complex &c)
{
	complex add;
	add.real=this->real+c.real;
	add.img=this->img+c.img;
	return add;
}
complex complex::operator*(const complex &c)
{
	complex mul;
	mul.real=(real*c.real)-(img*c.img);
	mul.img=(real*c.img)-(img*c.img);
	return mul;
}
void complex::operator++(void)
{
	++real;
	++img;
}
void complex::operator-(void)
{
	real=-(real);
	img=-(img);
}
int main()
{
	complex c1;
	cout<<"Enter complex-"<<endl;
	c1.setValues();
	cout<<"c1-"<<c1.getValues(0)<<"+"<<c1.getValues(1)<<"i"<<endl;
	complex c2;
	cout<<"Enter complex-"<<endl;
	c2.setValues();
	cout<<"c2-"<<c2.getValues(0)<<"+"<<c2.getValues(1)<<"i"<<endl;
	complex c3;
	c3=c1+c2;
	cout<<"c3-"<<c3.getValues(0)<<"+"<<c3.getValues(1)<<"i"<<endl;
	++c3;
	cout<<"updated c3-"<<c3.getValues(0)<<"+"<<c3.getValues(1)<<"i"<<endl;
	-c2;
	cout<<"updated c2="<<c2.getValues(0)<<"+"<<c2.getValues(1)<<"i"<<endl;
}
