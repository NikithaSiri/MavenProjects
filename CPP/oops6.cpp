#include<iostream>
using namespace std;

int main()
{
    int n,i=1,fact=1;
    char key;
    do{
    cout<<"enter the number"<<endl;
    cin>>n;

    while(i<=n)
    {
    fact=fact*i;
    i++;
    }
    cout<<"factorial="<<fact<<endl;
    cout<<"enter A to quit"<<endl;
    cin>>key;
    }while(key!='A');
}
