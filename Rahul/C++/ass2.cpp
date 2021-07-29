#include<iostream>
using namespace std;
class matrix:
	{
		private:
			int **M;
			int row;
			int col;
		public:
			void Matrix(void);
			void setValues(void);
			friend ostream& operator<<(ostream&,Matrix&);
			friend istream& operator>>(istream&,Matrix&);
		    Matrix(int,int);
			Matrix operator +(Matrix&);
			friend int check(Matrix&);
			friend Matrix operator *(Matrix&,Matrix&);			
	};
	ostream& operator<<(ostream&o,Matrix&m)
	{
		for(i=0;i<m.row;i++)
		{
			for(j=0;j<m.col;j++)
			{
				o<<m.M[i][j]<<" ";
			}
			cout<<endl;
		}
		return 0;
	}
	istream& operator>>(istream&o,Matrix&m)
	{
		for(i=0;;i<m.row;i++)
		{
			for(j=0;j<m.col;j++)
			{
				o>>m.M[i][j];
			}
		}
		return 0;
	}
	int check(Matrix&m)
	{
		if(m.row==0||m.col==0)
		return 0;
		else
		return 1;
	}
	void Matrix::setValues(void)
	{
		cin>>row>>col;
		M=new int*[row];
		for(int a=0;a<row;a++)
		{
			M[a]=new int[col];
		}
	}
	Matrix::Matrix(int i,int j)
	{
		row=i;
		col=j;
		M=new int*[i];
		for(int a=0;a<i;a++)
		{
			M[a]=new int[j];
		}
	}
	Matrix::Matrix(void)
	{
		row=0;
		col=0;
	}
	Matrix::Matrix operator +(Matrix&m)
	{
		if(m.row!=row||m.col!=col)
		{
			cout<<"Addition not possible!!"<<endl;
			return Matrix(0,0);
		}
		Add(row,col)
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					Add.M[i][j]=M[i][j]+m.M[i][j];
				}
			}
		}
		return add;
	}
	Matrix operator *(Matrix&m1,Matrix&m2)
	{
		if(m1.col!=m2.row)
		{
			cout<<"Matrix mul not possible!!"<<endl;
			return Matrix(0,0);
		}
		int sum=0;
		Matrix Mul(m1.row,m2.col);
		for(i=0;i<m1.row;i++)
		{
			for(j=0;j<m2.col;j++)
			{
				for(k=0;k<m2.row;k++)
				{
					sum+=m1.M[i][k]*m2.M[k][j];
				}
				Mul.M[i][j]=sum;
				sum=0;
			}	
		}
		return Mul;
	}
	int main()
	{
		int n;
		cout<<"Enter the number of matrices:"<<endl;
		cin>>n;
		Matrix*m=new Matrix[n];
		for(int i=0;i<n;i++)
		{
			cout<<"Enter the rows and cols"<<i+1<<endl;
			m[i].setValues();
			cout<<"Enter the matrix:"<<endl;
			cin>>m[i];
			cout<<"The matrix is:"<<endl;
			cin>>m[i];
		}
		int i,key;
		Matrix add
	}
