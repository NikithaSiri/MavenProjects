#include<iostream>
using namespace std;

int main(void)
{
    int n,ans=0;
    char key;
    do
{
    cout<<"enter the number:"<<endl;
    cin>>n;
    while(n!=0)
    {
    if(n%2==1)
    ans++;
    n=n/2;
    }
    cout<<"number of 1s   "<<ans<<endl;
    cout<<"number of 0s   "<<16-ans<<endl;
    cout<<"press 'A' to stop the program"<<endl;
    cin>>key;
}while(key!='A');

}
