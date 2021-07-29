#include<iostream>
using namespace std;
class complex
{
	private:
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
		void setValues(void)
		{
			real=new int;
			img=new int;
			cin>>*real>>*img;
		}
		int getValues(int flag)
		{
			if(flag==0)
			return *real;
			if(flag==1)
			return *img;
		}
		complex doAdd(complex &c)
		{
			complex add;
			add.real=*real+c.real;
			add.img=*img+c.img;
			return add;
		}
		friend complex doMul(const complex &a, const complex &b)
		{
			complex mul;
			*(mul.real)=(*(a.real)**(b.real))-(*(a.img)**(b.img));
			*(mul.img)=(*(a.real)**(b.img))-(*(a.img)**(b.real));
			return mul;
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
	cout<<"Enter no. of complex numbers:"<<endl;
	cin>>n;
	complex c[n];
	for(i=0;i<n;i++)
	{
		cout<<"Enter the complex:"<<endl;
		c[i].setValues();
	}
	for(i=0;i<n;i++)
	{
		cout<<"c["<<i<<"]:"<<c[i].getValues(0)<<"+"<<c[i].getValues(1)<<"i"<<endl;
    }
    complex add;
    for(i=0;i<n;i++)
    {
    	add=add.doAdd(c[i]);
    	cout<<"After adding c["<<i<<"]:"<<add.getValues(0)<<"+"<<add.getValues(1)<<"i"<<endl;
	}
	complex mul;
	mul=c[0];
	for(i=0;i<n;i++)
	{
		doMul(mul,c[i]);
		cout<<"After multiplying c["<<i<<"]:"<<mul.getValues(0)<<"+"<<mul.getValues(1)<<"i"<<endl;
	}
}
