#include <iostream>
using namespace std;
class school
{
	public:
		int a;
};
class abc:public school
{
	public:
	void a()
	{
		cout<<"in class abc"<<endl;
	}
};
class def : public school
{
	public:
	void b()
	{
		cout<<"in class def"<<endl;
	}
};
class gh : public abc, public def
{
	public:
	void c()
	{
		cout<<"in class abc and def"<<endl;
	}
};
class ijk: public school
{
	public:
	void d()
	{
		cout<<"in class ijk "<<endl;
	}
};
class lm:public ijk
{
	public:
	void e()
	{
		cout<<"in class def"<<endl;
	}
};
int main()
{
	lm o1;
	gh o2;
	o2.b();
	return 0;
}
