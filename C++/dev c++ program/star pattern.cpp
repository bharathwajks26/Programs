#include <iostream>
#include <cmath>
using namespace std;
int main()
{
	int i,j,b;
	float a;
	cout<<"enter int num of line";
	cin>>a;
	b=a+1;
	if (floor(a)==a and a>=0)
	{
		for(i=0;i<b;i++)
		{
			for(j=0;j<i;j++)
			{
				cout<<"*";
			}
			cout<<endl;
		}
	}
	else
	{
		cout<<"invalid";
	}
}
