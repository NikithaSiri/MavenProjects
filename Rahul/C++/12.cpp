#include<iostream>
using namespace std;
class student
{
	private:
		char fname[50];
		char lname[50];
		int roll;
		char gender[50];
	public:
		void setvalues(void)
		{
			cout<<"Enter first name:"<<endl;
			cin>>fname;
			cout<<"Enter last name:"<<endl;
			cin>>lname;
			cout<<"Enter gender:"<<endl;
			cin>>gender;
			cout<<"Enter roll:"<<endl;
			cin>>roll;
		}
		void getvalues(void)
		{
			cout<<fname<<endl;
			cout<<lname<<endl;
			cout<<gender<<endl;
			cout<<roll<<endl;
		}
};
int main(void)
{
	student s;
	s.setvalues();
	cout<<"student info:"<<endl;
	s.getvalues();
	return 1;
}
