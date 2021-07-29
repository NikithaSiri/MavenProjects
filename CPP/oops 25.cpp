/*Demonstrate the concept of class with pointer data 
member by creating a class “Bowler” to maintain 
wickets took in ‘n’ innings at runtime along with, 
bowling average economy, and name of the bowler 
(100 characters max) as data. And, perform: 
a) Create two bowler objects b1, b2. 
b) Allow user to fill performances in ‘n’ innings by 
b1 and b2. 
c) Display highest wicket taker name 
d) Display best economy bowler. */
#include<iostream>
using namespace std;
//#define wic 10
#define nam 100
class bowler
{
	private :
		int *wicket;
		char name[nam];
		int n;
		float *eco;
		int sum;
		float avg;
	
	public:
		void setvalues(void)
		{  int i;
			cout<<"enter the bowler name-"<<endl;
			cin>>name;
			cout<<"enter the number of innings-"<<endl;
			cin>>n;
			wicket=new int[n];
			if(NULL==wicket)
			{ cout<<"object creation failed"<<endl;
			exit(0);
			}
			sum=0;
			for(i=0;i<n;i++)
			{ 
		      cout<<"wicket in match["<<i+1<<"]-"<<endl;
			  cin>>wicket[i];	
		sum=sum+wicket[i];
			}
			
			cout<<"total number of wickets-"<<sum<<endl;
		}
	void economy(bowler &s)
	{int i; 
//	cout<<"enter the number matches-"<<endl;
//	cin>>n;
	
	s.eco=new float[s.n];
			if(NULL==s.eco)
			{ 
			cout<<"object creation failed"<<endl;
			exit(0);
			}
			avg=0;
			for(i=0;i<s.n;i++)
			{ 
		      cout<<"economy["<<i+1<<"]-"<<endl;
			  cin>>s.eco[i];	
			s.avg=avg+s.eco[i];
			}
			s.avg=(float)s.avg/n;
			
			cout<<"economy of the bowler-"<<s.avg<<endl;
			
	        
	
	}
	
	void docmp(bowler &s)
	{  
	
    if(avg<s.avg)
	cout<<name<<" has best economy"<<endl;
	else if(avg>s.avg)
	cout<<s.name<<" has best economy"<<endl;
	else
	 	
	cout<<s.name<<"and"<<name<<" has same economy"<<endl;
	
	
	}
	void display(bowler &s)
	{
		if(sum>s.sum)
		cout<<name<<" is highest wicket taker"<<endl;
		
		 else if(sum<s.sum)
		cout<<s.name<<" is highest wicket taker"<<endl;
		
		else 
		cout<<s.name<<"and"<<name<<" has equal number of wickets"<<endl;
	}

};

int main()
{
	bowler b1;
	cout<<"enter bowler 1 detailes:"<<endl;
	b1.setvalues();
	cout<<"enter bowler2 detailes:"<<endl;
	bowler b2;
    b2.setvalues() ;
    cout<<"enter economy of bowler 1-"<<endl;
   economy(b1);
    cout<<"enter economy of bowler 2-"<<endl;
   economy(b2);
   b1.docmp(b2);
   b1.display(b2);
 
}
	
	
	












