 #include<iostream>
using namespace std;
int getbig(int ,int );
char getbig(char,char);
float getbig(float,float);
int main ()
{ int a,b;
char key;
do {

cout<<"enter two number a and b"<<endl;
cin>>a>>b;
cout<<"biggest of two is  "<<getbig(a,b)<<endl;
char c,d;
cout<<"enter two character data types "<<endl;
cin>>c>>d;
cout <<"biggest of two characters data types   "<<getbig(c,d)<<endl;
float e,f;
cout<<"enter two floating data types "<<endl;
cin>>e>>f;
cout<<"biggest of two floating poin data types  "<<getbig(e,f)<<endl;
cout<<"enter A to stop"<<endl;
cin>>key;}
while(key!='A');

}
int getbig (int a,int b)
{ if (a>b)
return a;
else 
return b;
}
char getbig(char a,char b)
{ if (a>b)
return a;
else 
return b ;
}
float getbig(float a,float b)
{ if (a>b)
return a;
if (b>a)
return b;
}



