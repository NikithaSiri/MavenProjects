#include<iostream>
using namespace std;
#define row 10
#define col 10
class matrix
{
	private:
		int a[row][col];
		int r;
		int c;
	public:
		matrix(void);
		matrix(int,int);
		matrix(const matrix &);
		void setValues(void);
		void doAdd(matrix &);
		void friend doMul(matrix &,matrix &);		
};
void matrix::setValues(void)
{
	int i,j;
	cout<<"Enter the order:"<<endl;
	cin>>r>>c;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<"Enter a["<<i<<"]["<<j<<"]:"<<endl;
			cin>>a[i][j];
		}
	}
	cout<<"The matrix is:"<<'\n';
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<a[i][j]<<'\t';
		}
		cout<<'\n';
	}
}
matrix::matrix(void)
{
	int i,j;
	cout<<"dc"<<endl;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			a[i][j]=0;
		}
	}
}
matrix::matrix(int c,int b)
{
    cout<<"pc"<<endl;
    int i,j;
    r=c;
    c=b;
    for(i=0;i<r;i++)
    {
    	for(j=0;j<c;j++)
    	{
    		cout<<"Enter a["<<i<<"]["<<j<<"]:"<<endl;
    		cin>>a[i][j];
		}
	}
	cout<<"The matrix is:"<<endl;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<a[i][j]<<'\t';
		}
		cout<<'\n';
	}
}
matrix::matrix(const matrix &s)
{
	cout<<"cc"<<endl;
	matrix n;
	r=s.r;
	c=s.c;
	int i,j;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			a[i][j]=s.a[i][j];
		}
	}
	cout<<"The matrix is:"<<endl;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<a[i][j]<<'\t';
		}
			cout<<'\n';
	}

}
void matrix::doAdd(matrix &m)
{
	matrix add;
	int i,j;
	if(m.r!=r||c!=m.c)
	{
		cout<<"addition is not possible!!"<<endl;
		exit(0);
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			add.a[i][j]=a[i][j]+m.a[i][j];
		}
	}
	cout<<"the matrix after addition is:"<<endl;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<add.a[i][j]<<'\t';
		}
		cout<<'\n';
	}
}
void doMul(matrix &s,matrix &d)
{
	int i,j,k,sum=0;
	matrix mul;
	if(s.c!=d.r)
	{
		cout<<"mul not possible!!"<<endl;
		exit(0);
	}
	for(i=0;i<s.r;i++)
	{
		for(j=0;j<d.c;j++)
		{
			for(k=0;k<s.c;k++)
			{
				sum=sum+s.a[i][k]*d.a[i][j];
			}
			mul.a[i][j]=sum;
		}
	}
	cout<<"The matrix after mul is:"<<endl;
	for(i=0;i<s.r;i++)
	{
		for(j=0;j<d.c;j++)
		{
			cout<<mul.a[i][j]<<'\t';
		}
		cout<<'\n';
	}
}
int main()
{
	matrix m1,m2;
	cout<<"enter the matrix1:"<<endl;
	m1.setValues();
	cout<<"enter the matrix2:"<<endl;
	m2.setValues();
	m2.doAdd(m1);
	doMul(m1,m2);
}
