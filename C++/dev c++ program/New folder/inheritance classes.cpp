#include <iostream>
using namespace std;
class school
{
	public:
		int stu=20;
		
};
class abc: public school
{
	public:
		int a;
	int a1()
	{
		a=10;
		cout<<"total num of student in class abc"<<a+stu<<endl;
	}
};
class def: public school
{
	public:
		int b;
	int b1()
	{
		b=8;
		cout<<"total num of student in class def "<<b+stu<<endl;
	}
};
class gh: public school
{
	public:
		int c;
	int c1()
	{
		c=4;
		cout<<"total num of student in class gh "<<c+stu<<endl;
	}
};
class ij: public abc
{
	public:
		int d;
	int d1()
	{
		d=6;
		cout<<"total num of student in class abcij "<<a+stu+d<<endl;
	}
};
int main()
{
	//abc o1;
	def o2;
	gh o3;
	ij o4;
	cout<<o2.b1();
	cout<<o3.c1();
	cout<<o4.d1();
	cout<<o4.a1();
	return 0;
}
