#include<iostream>
using namespace std;
#define row 50
#define col 50
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
		void getValues(void);
		void doadd(matrix &);
};
matrix::matrix(void)
{
	int i,j;
	cout<<"Default constructor"<<endl;
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			a[i][j]=0;
		}
	}
}
matrix::matrix(int c,int b)
{
	int i,j;
	r=c;
	c=b;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<"enter a["<<i<<"]["<<j<<"]:"<<endl;
			cin>>a[i][j];
		}
	}
	cout<<"the matrix is:"<<endl;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<a[i][j]<<'\t';
		}
		cout<<'\n';
	}
}
void matrix::setValues(void)
{
	int i,j;
	cout<<"enter the order"<<endl;
	cin>>r>>c;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			cout<<"enter a["<<i<<"]["<<j<<"]:"<<endl;
            cin>>a[i][j];
        }
	}
	cout<<'\n'<<"the matrix is"<<'\n';
    for(i=0;i<r;i++)
       { 
          for(j=0;j<c;j++)
            {
              cout<<a[i][j]<<'\t';
 
            }
             cout<<'\n';
        }
}
void matrix::doadd(matrix &m)
{
	matrix add;
	int i,j;
	if(r==m.r&&c==m.c)
	{
		 for(i=0;i<r;i++)
           {
			 for(j=0;j<c;j++)
              {
                add.a[i][j]=a[i][j]+m.a[i][j]; 
              }
            }
	}
	cout<<'\n'<<"the matrix is"<<'\n';
        for(i=0;i<r;i++)
          { 
            for(j=0;j<c;j++)
              {
                cout<<add.a[i][j]<<'\t';
              }
              cout<<'\n';
          }
}
int main ()
{
matrix m1;
cout<<"enter the matrix1--"<<endl;
m1.setValues();
cout<<"enter the matrix1--"<<endl;
matrix m2(2,4);
m1.doadd(m2);
}
