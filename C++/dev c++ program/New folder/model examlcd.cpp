#include <iostream>
using namespace std;
int main()
{
    int n1, n2, i,n,n3;
	int gcd = 1, lcm = 1;
	cout<<"enter no";
	cin>>n;  
	    if (n==2)
		{
		cout << " Enter the two numbers you want to find the GCD and LCM of : \n\n";
	    cin >> n1 >> n2;
	    for ( i = 1; i < 1000; i++)
	    {
	        
	        if ((n1 % i == 0) && (n2 % i == 0))
	        {
	            gcd = i;          
	        }
	    }
		lcm = (n1 * n2) / gcd;
		cout << " \n\nThe GCD of the two numbers : " << n1 << " and " << n2 << " is : " << gcd;
	    cout << " \n\nThe LCM of the two numbers : " << n1 << " and " << n2 << " is : " << lcm << "\n\n";
	    cout << "\n\n\n";
		
		}
		else
		{
		cout << " Enter the three numbers you want to find the GCD and LCM of : \n\n";
	    cin >> n1 >> n2 >>n3;
	    for ( i = 1; i < 1000; i++)
	    {
	        
	        if ((n1 % i == 0) && (n2 % i == 0) && (n3 % i == 0))
	        {
	            gcd = i;          
	        }
	    }
		lcm = (n1 * n2 * n3) / gcd;
		cout << " \n\nThe GCD of the two numbers " << " is : " << gcd;
	    cout << " \n\nThe LCM of the two numbers " << " is : " << lcm << "\n\n";
	    cout << "\n\n\n";
		
		
			
		}
		
		return 0;
		 
}
