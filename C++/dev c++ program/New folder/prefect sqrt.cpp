#include <bits/stdc++.h>
using namespace std;
int main()
{
	int x;
	cout<<"enter num ";
	cin>>x;
	int s=sqrt(x);
	if (s*s==x)
	{
		cout<<"perfect square";
	}
	else 
	{
			cout<<"not perfect square";
	}
	return 0;
}	
