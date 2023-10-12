#include <iostream> 
using namespace std;
int main()
{
 int i, j;
 
 for(i=1; i<=4; i++)
 {
  for(j=1; j<i*2; j++) 
  {
   if(j%2 == 0)
    cout << " ";
   else 
    cout << i;
  }
  cout << "\n";
 }

for(i=3; i>=1; i--)
 {
  for(j=1; j<i*2; j++)
  {
   if(j%2 == 0)
    cout << " ";
   else 
    cout << i; 
  }
  cout << "\n";
 }
 return 0;
}

