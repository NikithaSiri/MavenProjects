#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
void main()
{
	char a[25],b[15];
	int index,i,l1,l2;
	printf("\n enter the string:");
	scanf("%s",&a);
	printf("\n enter the substring:");
	scanf("%s",&b);
	printf("\nenter the index of inserting pos");
	scanf("%d",&index);
	l1=strlen(a);
	l2=strlen(b);
	if(index>l1)
	{
		printf("\n Invalid");
		exit(0);
	}
	for(i=l1;i>=index;i--)
	a[i+l2]=a[i];
	for(i=0;i<l2;i++)
	{
		a[index+i]=b[i];
	}
	printf("\n Ater insert string: %s",a);
	getch();
}
