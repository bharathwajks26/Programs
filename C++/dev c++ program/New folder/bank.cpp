#include<iostream>
using namespace std;
class bank
{
	public:
};
class SBI: public bank
{
public:
	string name1="anirudh";
	float SA=50000;
};
	class ICICI: public SBI
{
public:
	string name2="yuvan";
	float SAL=35000;
};
class AXIS: public ICICI
{
public:
	string name3="thaman";
	float SALA=55000;
};
int main()
{
	AXIS r;
	cout<<"SALARY OF SBI "<<r.SA<<endl;
	cout<<"SALARY OF ICICI "<<r.SAL<<endl;
	cout<<"SALARY OF AXIS "<<r.SALA<<endl;
	cout<<"NAME OF SBI USER "<<r.name1<<endl;
	cout<<"NAME OF ICICI USER "<<r.name2<<endl;
	cout<<"NAME OF AXIS USER "<<r.name3<<endl;
	return 0;
}
