/*30. Demonstrate the concept of binary operator 
overloading to achieve addition and multiplication of 
two complex objects. Also, implement a unary 
operator overloading of – and ++ operators.*/ 
        
   #include<iostream>
using namespace std;
class complex
{
	private: 
	        float real;
	        float img;
	public:
		void setvalues(void);     
        complex operator+(const complex &);
        complex operator*(const complex &);
        float getvalues(int flag);
        void operator++(void);
        void operator-(void);
        
   };
        
     void complex::setvalues(void)
{
	cin>>real>>img;
}

float complex::getvalues(int flag)
{ 
  if(flag==0) 
  return real;
  if(flag==1)
   return img;
}
   complex complex:: operator+(const complex &c)
{
	complex add;
	add.real=this->real+c.real;
	add.img=this->img+c.img;
	return add;
	
}
        
        complex complex ::operator*(const complex &c)
{
	complex mul;
	mul.real= (real*c.real)-(img*c.img);
    mul.img=(real*c.img)+(img*c.real); 
	return mul;
}
void complex:: operator++(void)
{
	++real;
	++img;
}
  void complex:: operator-(void)
  {
  
      real=-(real);
      img=-(img);
  
  
  
  }      
        
  int main()
  {
  	
  	complex c1;
	cout<<"Enter complex- "<<endl;
	c1.setvalues();
	cout<<"c1="<<c1.getvalues(0)<<"+"<<c1.getvalues(1)<<"i"<<endl;
	complex c2;
	cout<<"Enter complex- "<<endl;
	c2.setvalues();
	cout<<"c2="<<c2.getvalues(0)<<"+"<<c2.getvalues(1)<<"i"<<endl;
	complex c3;
	c3=c1+c2;
	cout<<"c3="<<c3.getvalues(0)<<"+"<<c3.getvalues(1)<<"i"<<endl;
  	
  	++c3;
	cout<<"updated c3="<<c3.getvalues(0)<<"+"<<c3.getvalues(1)<<"i"<<endl;
  	
  	-c2;
	cout<<"updated c2="<<c2.getvalues(0)<<"+"<<"("<<c2.getvalues(1)<<")"<<"i"<<endl;
  	
		}      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
