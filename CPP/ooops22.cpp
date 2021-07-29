/*Write a C++ program to maintain a 2D integer 
matrix of order r x c as the data item of a class 
‘Matrix’ and perform: 
a) ADT class, initializing with Null Matrix. 
b) Create Matrix m1 as per user’s input. 
c) Create Matrix m2 with: 
[ 2 4 5 7 
 9 3 6 8] 
d) Perform addition of m1 & m2 using a member 
function. 
e) Using friend multiply the two matrices. */



#include<iostream>
using namespace std;
#define row 5
#define col 5

class matrix
{
     private:
    int a[row][col];
    int r;
    int c;
    public:
    matrix(void);
    matrix(const matrix &);
    matrix(int [2][4],int,int);
    void setvalues(void);
    void doadd(matrix &);
    void friend domul(matrix &,matrix &);	
    void getvalues(void);
~matrix(void);
};

matrix::matrix(void)
{
   int i,j;
   cout<<"dc"<<endl;
   for(i=0;i<row;i++)
   { 
   
   for(j=0;j<col;j++)

     {
           a[i][j]=0;
     }
   }

}

  

void matrix::setvalues(void)
{ 
         int i,j;
              cout<<"enter the order-";
              cin>>r>>c;
for(i=0;i<r;i++)
{ 
          for(j=0;j<c;j++)
         {
                   cout<<"enter a["<<i<<"]["<<j<<"]-"<<endl;
                   cin>>a[i][j];
 
         }
}


}

matrix::matrix(int x[2][4],int b,int d)
{
	int i,j;
	r=b;
	c=d;
	for(i=0;i<b;i++)
	{
		for(j=0;j<d;j++)
		{
			a[i][j]=x[i][j];
		}
	}
	
	
	
}

void matrix::getvalues(void)
{ int i,j;
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


matrix::matrix(const matrix &s)
{
          cout<<"cc";
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

                      
  
  
}

void matrix::doadd(matrix &m)


{
   matrix add;
     int i,j;
    if(m.r!=r||c!=m.c)

{ 
     cout<<"addition is not possible"<<endl;
    exit(0);
}

	for(i=0;i<r;i++)
{ 
          for(j=0;j<c;j++)
         {
 
             add.a[i][j]=a[i][j]+m.a[i][j]; 
          }
}

cout<<'\n'<<"the matrix after addition is"<<'\n';
for(i=0;i<r;i++)
{ 
  for(j=0;j<c;j++)
          {
             cout<<add.a[i][j]<<'\t';
 
          }
                   cout<<'\n';
}
	
}

void  domul(matrix &s,matrix &d)
{
	int i,j,k,sum=0;
	matrix mul;
	if(s.c!=d.r)
	{
	   cout<<"multiplication is not possible";
	   exit(0);
	}
	
	for(i=0;i<s.r;i++)
{ 
	     for (j=0;j<d.c;j++)
	{   sum=0;
		for(k=0;k<s.c;k++)
		{ 
		  sum=sum+s.a[i][k]*d.a[k][j];
		}
		mul.a[i][j]=sum;
	}
}
	
	cout<<'\n'<<"the matrix after multiplication is"<<'\n';

for(i=0;i<s.r;i++)
{ 
     for(j=0;j<d.c;j++)
{
 cout<<mul.a[i][j]<<'\t';
 
}
     cout<<'\n';
}
	
	
}
matrix::~matrix(void)
{ 
   cout<<"destructror"<<endl;
}



int main ()
{
matrix m1;

cout<<"enter the matrix1 to update--"<<endl;
m1.setvalues();
m1.getvalues();
int x[2][4]={ 2, 4, 5, 7, 9, 3, 6, 8};
matrix m2(x,2,4);
m2.getvalues();
m2.doadd(m1);

domul(m1,m2);
}
