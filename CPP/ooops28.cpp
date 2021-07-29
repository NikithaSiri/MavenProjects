/*Demonstrate the concept of allocating memory to objects at run-time by writing a C++ class 
“complex”, to maintain ‘n’ complex numbers at 
runtime. And, add them using a member function 
while multiply using a friend function.*/
#include<iostream>
using namespace std;
class complex
{   private:
	int *real;
	int *img;
	public:
	complex(void)
			{
				cout<<"dc"<<endl;
				
				real=new int;
				img=new int;
				*real=0;
				*img=0; 
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
		else if (flag==1)
		return *img;
	}
	
	complex doadd(complex &c)
	{
		complex omg;
		
		
	*(omg.real)=*real+*(c.real);
		*(omg.img)=*img+*(c.img);
		
		return omg;
	}
	
 friend complex domul(const complex &a,const complex &b)
{complex ans;
   *(ans.real)=(*(a.real)**(b.real))-(*(a.img)**(b.img));
   *(ans.img)=(*(a.real)**(b.img))+(*(a.img)**(b.real));
   return ans;
}
~complex(void)
{
	cout<<"dd"<<endl;
	delete real;
	delete img;
}
	
 };
 
 
 
 int main()
 {
 int n,i;
 
 	
 	cout<<"enter number of complex numbers-"<<endl;
 	cin>>n;
 	complex c[n];
 	for(i=0;i<n;i++)
 	{cout<<"enter the complex-";
 		c[i].setvalues();
	 }
 	
 	for(i=0;i<n;i++)
 	{
 		cout<<"c["<<i<<"]-"<<c[i].getvalues(0)<<"+"<<c[i].getvalues(1)<<"i"<<endl;
	 }
 	
 	complex add;
 	for(i=0;i<n;i++)
 add=add.doadd(c[i]);
	cout<<"addition c["<<i<<"]-"<<add.getvalues(0)<<"+"<<add.getvalues(1)<<"i"<<endl;
 	complex mul;
 	mul=c[0];
for(i=1;i<n;i++)
mul=domul(mul,c[i]);
cout<<"after multiplication c["<<i<<"]="<<mul.getvalues(0)<<"+"<<mul.getvalues(1)<<"i"<<endl;

 	
 }
