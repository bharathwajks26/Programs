#include <iostream>
using namespace std;
class per
{
	
	public:
		char a[20]="michael de santo";
		char b[20]="trevor phillips";
	
};
class stu: public per
{
	public:
		void print()
		{
			cout<<a<<" is a student"<<endl;
		}
};
class fac:public per
{
	public:
		void out()
		{
			cout<<b<<" is a faculty";
		}
};
int main()
{
	fac obj;
	stu ob;
	ob.print();
	obj.out();
	return 0;
}
