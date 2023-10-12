#include <iostream>
using namespace std;
class bank
{
	public:
		float amount=50000;
};
class sbi: public bank
{
	public:
		float rate1=0.05;
	int sbir()
	{
		int c;
		c=amount*rate1;
		return c;
	}	
};
int main()
{
	sbi o;
	cout<<o.sbir();
	return 0;
}
