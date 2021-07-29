#include<iostream>
using namespace std;
#define row 10
#define col 10
int main(void)
{ int a[row][col];

int i,j,k,m,n,p,q,sum=0;
int transa[row][col];
cout<<"enter the order of matrix 1- ";
cin>>m>>n;
for (i=0;i<m;i++)
{ for(j=0;j<n;j++)
{ cout<<"enter a["<<i<<"]["<<j<<"]-";
cin>>a[i][j];
}
}
cout<<'\n'<<"the matrix1 is -"<<'\n';
for (i=0;i<m;i++)
{ for(j=0;j<n;j++)
{ 
cout<<a[i][j]<<'\t';
}
cout<<'\n';
}
for (i=0;i<m;i++)
{ for(j=0;j<n;j++)
{ transa[j][i]=a[i][j];
}
}
cout<<'\n'<<"the transpose of matrix1 is -"<<'\n';
for (i=0;i<n;i++)
{ for(j=0;j<m;j++)
{ 
cout<<transa[i][j]<<'\t';
}
cout<<'\n';
}
}
