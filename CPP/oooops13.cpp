#include<iostream>
using namespace std;
class student
{ private :  
char lastname[50];
char firstname[50];
char gender;
int rollnumber;
public:
	void setvalues(void)
	{ cout<<"enter first name"<<endl;
	cin>>firstname;
	cout<<"enter last name"<<endl;
	cin>>lastname;
	cout<<"enter gender M male and F for female"<<endl;
	cin>>gender;
	cout<<"enter roll number"<<endl;
	cin>>rollnumber;
	}
	
	void getvalues(void)
	{cout<<firstname<<endl;
	cout<<lastname<<endl;
	cout<<gender<<endl;
	cout<<rollnumber<<endl;
	}
};
	
int main(void)
{ student A;
A.setvalues();
cout<<"student info : "<<endl;
A.getvalues();
return 1;
}









