/*Demonstrate constructor overloading property and 
propose the need of a mandate copy constructor for 
complex class representing a complex number*/
#include<iostream>
using namespace std;
class A
{
	private:
		int *real;
		int *img;
		public:
			A(void)
			{
				cout<<"dc"<<endl;
				
				real=new int;
				img=new int;
				*real=0;
				*img=0;
				
				
				
			}
			
			A(int a,int b)
			{
			cout<<"pc"<<endl;	
				real=new int;
				img=new int;
				*real=a;
				*img=b;
				
				
				
			}
			
			
			
			A(const A&c)
			
			{ cout<<"cc"<<endl;
			 real=new int;
			img=new int;
			*real=*(c.real);
			*img=*(c.img);
				
				
				
				
				
			}
		
			void setvalues(void)
			{
				
				real=new int;
				img=new int;
				cin>>*real>>*img;
				
				
				
			}
			
			
			int getvalues(int flag)
	       {
	       	
	        if(flag==0)
			return *real;
			else 
			return *img;
		       	
	       	
	       	
	       	
		   }
		   
		   ~A(void)
		   {
		   	cout<<"dd"<<endl;
		   	delete real;
		   	delete img;
		   }
		   
	
};


int main()
{
	A c1;
	cout<<c1.getvalues(0)<<"+"<<c1.getvalues(1)<<"i"<<endl;
	
	
	A c2;
	cout<<"enter the complex-"<<endl;
	c2.setvalues();
	cout<<c2.getvalues(0)<<"+"<<c2.getvalues(1)<<"i"<<endl;
	
	A c3(2,6);
	
	cout<<c3.getvalues(0)<<"+"<<c3.getvalues(1)<<"i"<<endl;
	
	A c4(c3);
	
	cout<<c4.getvalues(0)<<"+"<<c4.getvalues(1)<<"i"<<endl;
	
	A c5(1,7);
	cout<<c5.getvalues(0)<<"+"<<c5.getvalues(1)<<"i"<<endl;
	
}
