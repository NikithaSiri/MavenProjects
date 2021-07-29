#include<iostream>
using namespace std;
int main (void)
{ int a,b,ans,choice;
char shit;
do
{ cout<<"enter a and b"<<endl;
cin>>a>>b;
cout<<"select 1add,2sub,3mul,4,div,5mdiv"<<endl;
cin>>choice;
switch(choice){

case 1:
	ans=a+b;
	break;
	case 2:
		ans =a-b;
		break;
		case 3:
			ans=a*b;
			break;
			case 4:
				ans =a/b;
				break;
				case 5:
					ans=a%b;
					break;
					default :
						cout<<"lafoot"<<endl;
						break;
						
}cout<<" answer is "<<ans<<endl;
cout<<"enter  A  to stop or any other to continue"<<endl;
cin>>shit;
}while (shit!='A');

}
