#include <iostream>
using namespace std;
class student
{
	private:
		char fname[10];
		char lname[10];
		int marks[5];
		int sum;
		float cgpa;
	public:
		void setdetails();//mutator
		void getcgpa();
		void betterperform(student&);
};
void student::setdetails()
{
	int i;
	cout<<"Enter first name:"<<endl;
	cin>>fname;
	cout<<"Enter last name:"<<endl;
	cin>>lname;
	cout<<"Enter marks in 6 subjects:"<<endl;
	for(i=0;i<6;i++)
	{
		cout<<" marks["<<i<<"]: ";
		cin>>marks[i];
		cout<<endl;
	}
}
void student::getcgpa()
{
	float per;
	sum=0.0;
	int i;
	cout<<"CGPA acquired is:"<<endl;
	for(i=0;i<6;i++)
	{
		if(marks[i]<40)
		{
			cout<<"Failed in marks["<<i<<"] subject";
			cgpa=0.0;
			cout<<cgpa<<endl;
		}
		else
		{
			sum=sum+marks[i];
		    continue;
			per=(sum/600)*100;
    	    cgpa=per/9.5;
	        cout.setf(ios::fixed);
	        cout.setf(ios::showpoint);
	        cout.precision(4);
	        cout<<cgpa<<endl;
		}
	}
	
}
void student::betterperform(student&s)
{
	
	int i;
	for(i=0;i<6;i++)
	{
		if(marks[i]>s.marks[i])
		{
			cout<<"student 1 marks["<<i<<"] is better"<<endl; 
		}
		else if(s.marks[i]>marks[i])
		{
			cout<<"student 2 marks["<<i<<"] is better"<<endl;
		}
	}
	cout<<"Better overall performer is:"<<endl;
	if(sum>s.sum)
	{
		cout<<"STUDENT 1"<<endl;
	}
	else if(sum<s.sum)
	{
		cout<<"STUDENT 2"<<endl;
	}
}
int main()
{
	student s1,s2;
	cout<<"STUDENT 1:"<<endl;
	s1.setdetails();
	cout<<"STUDENT 2:"<<endl;
	s2.setdetails();
	cout<<"Student 1 academics:"<<endl;
	s1.getcgpa();
	cout<<"Student 2 academics:"<<endl;
	s2.getcgpa();
	s1.betterperform(s2);
	return 0;
}
