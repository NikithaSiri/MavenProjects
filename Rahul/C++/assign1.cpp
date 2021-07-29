#include <iostream>
#include <math.h>
using namespace std;
class point
{
    private:
            int x;
            int y;
    public:
           point(void);
           void getvalues(void);
           void setvalues(void);
           float dist(const point &);
           float area(const point &,const point &);
           ~point(void);
};
point::point(void)
{
    x=0;
    y=0;
}
void point::getvalues(void)
{              
	            static int k=0;
	            k++;
               cout<<"enter the points  (x"<<k<<",y"<<k<<")"<<endl;
               cin>>x>>y;
}
void point::setvalues(void)
{
    cout<<"("<<x<<","<<y<<")"<<endl;
}
float point::dist(const point &i)
{
    float n;
    int a=i.x;
    int b=i.y;
    n=sqrtf(((x-a)*(x-a))+((y-b)*(y-b)));
    return n;
}
          
float point::area(const point &a,const point &b)
{
    float area;
    area=(((x*a.y-y*a.x)+(a.x*b.y-a.y*b.x)+(y*b.x-x*b.y))/2);		
    if(area<0)
    {
    	area=abs(area);
    }
    return area;
} 
point::~point(void)
{
}     


int main (void)
{
    point p[50];
    int a,b,n,i,j,t;
    float sma,lar;
    float q[50][50]={0.0};
    float q1[50]={0.0};
    cout<<"no of points-";									
    cin>>n;
    for(i=0;i<n;i++)
    {
      p[i].getvalues();
      p[i].setvalues();
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            q[i][j]=p[i].dist(p[j]);
        }
    } 
    sma=q[0][1];
    for(i=0;i<n;i++) 
    {
        for(j=0;j<n;j++)
        {
            if((q[i][j]<=sma)&&(q[i][j]!=0))
            {
                sma=q[i][j];
                a=i;
                b=j;
            }
         
        }
    }
    cout<<"\nShortest distanced points are"<<endl;
    p[a].setvalues();
	 p[b].setvalues();
    if(n>2)
    {
    for(i=0;i<n;i++)
        {
        	q1[i]=p[a].area(p[b],p[i]);
        }
    lar=q1[0];
    for(i=0;i<n;i++)
    {
        if(q1[i]>lar)
        {
           lar=q1[i];
           t=i;
        }
    }
    if(lar==0)
    {
      cout<<"\nThese are collinear points and they don't form a triangle!!"<<endl;        //incase given points are collinear
	 }
	 else 
	 {
	 cout<<"\nLargest area is "<<lar<<endl<<"with the point ";
	 p[t].setvalues();
	 return 0;
    }
    }
    else 
    {
    cout<<"\nTwo points cannot form a triangle!!"<<endl;                  //incase only 2 points are given
    return 0;
    }
}
