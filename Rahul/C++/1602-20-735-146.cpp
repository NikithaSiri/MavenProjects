/*(5).No,we can't construct a private member fuction to remove the duplicate.
Because by declaring them under private section of class,it cannot be accessed directly with the help of object in main program.
So, if we want to use it then we have to declare that function under public section of a class.
*/
#include <iostream>
using namespace std;
class set
 {
  private:
	  int *a;
	  int n;
  public:
	 set operator+(set &);
	 friend istream & operator>>(istream &,set &);
	 friend ostream & operator<<(ostream &,set &);
	 void friend doduplicate(set &);
	 friend set operator^(set &,set&);
	 friend set operator-(set &,set&);
 };
  istream & operator>>(istream &in,set &s)
 {
    int i;
	cout<<"enter the number of elements-";
	in>>s.n;
	
	s.a=new int[s.n];

if(NULL==s.a)
  { 
    cout<<"object creation is failed:";
    exit(0);
  }
 for(i=0;i<s.n;i++)
   { 
      cout<<"enter s["<<i+1<<"]-";
      in>>s.a[i];
   }

return in;

}

  ostream & operator<<(ostream &ou,set &s)
 
 {	
    int i;
    for(i=0;i<s.n;i++)
     { 

       ou<<s.a[i]<<" ";

     }
   return ou;	
 	
 }
 
 
 
 set set::operator+(set &s)
 {
 	
 	set ans;
 	ans.n=this->n+s.n;
 	ans.a=new int[ans.n];

if(NULL==ans.a)
   { 
     cout<<"object creation is failed:";
     exit(0);
   }
 	
     int i,j,k;
     ans.n=this->n+s.n;
     for(i=0,j=0;i<this->n;i++,j++)
     ans.a[j]=this->a[i];
     for (i=0;i<s.n;i++,j++)
     ans.a[j]=s.a[i];
     return ans;
 
 }
 
 
 void  doduplicate( set &s)
 {
   int i,j,k;

    for(i=0;i<s.n;++i)
	    	for(j=i+1;j<s.n;)
		   {
			      if(s.a[i]==s.a[j])
			    {
				   for(k=j;k<s.n-1;++k)
				   s.a[k]=s.a[k+1];
					
				   --s.n;
			     }
			        else
				    ++j;
	    	}
	
	
 
 }
 
set operator^(set &c,set&d)
 {
 	set ans;
	if(c.n>d.n)
	ans.n=c.n;
	else
	ans.n=d.n;
	ans.a=new int[ans.n];
    if(NULL==ans.a)
          { 
            cout<<"object creation is failed:";
             exit(0);
          }
    int i,j,k=0;
    for(i=0;i<c.n;i++)
  {
	  for(j=0;j<d.n;j++)
	{
		  if(c.a[i]==d.a[j])
		{
			ans.a[k]=c.a[i];
			k++;
			break;
		}
	}
}
  ans.n=k;
return ans;
 
 }
 
 set operator-(set &p,set&q)
 {
 	set c;
 	c.n=p.n;
 	c.a=new int[c.n];
    if(NULL==c.a)
       { 
          cout<<"object creation is failed:";
          exit(0);
       }
     int i,j,k;
     int l=0;
     int min=0;
     for(i=0;i<p.n;i++)
    {
    	k=p.a[i];
  	    min=0;
  	 for(j=0;j<q.n;j++)
	  {
	  	   if(k==q.a[j])
             {
               min=1;
               break;
             }
	  }
	     if(min==0)
		{
             c.a[l]=k;
             l++;
        }
}
    c.n=l;
return c;
}
 int main ()
 {
  set s1;
  cout<<"Enter the 1st set-"<<endl;
  cin>>s1; 
  set s2;
  cout<<"Enter the 2nd set-"<<endl;
  cin>>s2;
   cout<<"S{A}= ";
  cout<<s1<<endl;
  cout<<"S{B}= ";
  cout<<s2<<endl;
  set s3;  
  s3=s1+s2;
  doduplicate(s3);
  cout<<"S{A U B}= ";
  cout<<s3<<endl;
 set s4;
  s4=s1^s2;
  doduplicate(s3);
  cout<<"S{A ^ B}= ";
  cout<<s4<<endl;
  set s5;
  s5=s1-s2;
  doduplicate(s5);
 cout<<"S{A - B}= ";
 cout<<s5<<endl;
 }
 
