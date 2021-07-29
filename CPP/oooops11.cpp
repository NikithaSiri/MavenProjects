#include<iostream>
using namespace std;
#define PI 22.0/7
float isuggest(float,float,float,float);
float isuggest(float,float,float);
int main (void)
{ float rec_cost,rec_l,rec_b,rec_h,vol_rec;
float cir_cost,cir_d,cir_h,vol_cir,a,c;
cout<<"the cost of rectangular pizza is "<<endl;
cin>>rec_cost;
cout<<"the cost of circular pizza is "<<endl;
cin>>cir_cost;
cout<<"enter length,breadth,height"<<endl;
cin>>rec_l>>rec_b>>rec_h;
a=isuggest(rec_cost,rec_l,rec_b,rec_h);

cout<<"enter diameter"<<endl;
cin>>cir_d;
cout<<"enter height"<<endl;
cin>>cir_h;
c=isuggest(cir_cost,cir_d,cir_h);
 if (a<c)
 cout<<" i suggest rectangular pizza"<<endl;
 else 
 cout<<"i suggest circular pizza"<<endl;
}
float isuggest(float p,float l,float b,float h)
{ float vol;
vol=l*b*h;
return (p/vol);
}
float isuggest(float p,float d,float k)
{ float vol;
vol=PI*d/2.0*d/2.0*k;
return (p/vol);
}







