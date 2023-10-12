import java.util.Scanner;
public class oddseries
{
public static void main(String[] args)
{
int n=100;
int i=0;
int s=0;
while(i<n)
{
if(i%2!=0)
{
s=s+i;
}
i=i+1;
}
System.out.println("Value "+s);
}
}