#include <iostream>
using namespace std;
class person
{
	public:
		string name="sam";
		int sal=20000;
};
class bonus: public person
{
public:
	float b=5000;
int add()
{
	int c;
	c=b+sal;
	return c;
}
};
int main()
{
	bonus o;
	cout<<"intial "<<o.sal<<endl;
	cout<<"bonus "<<o.b<<endl;
	cout<<"salary "<<o.add();
	return 0;
}
