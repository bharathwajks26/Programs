import java.util.*;

public class series{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double n=s.nextDouble();
double i,sum=0;
Fact obj=new Fact();
for(i=1;i<=n;i++)
{
if(i%2==0){	
sum=sum-(i/obj.facto(i));
}
else
{
sum=sum+(i/obj.facto(i));
}
}
System.out.println("sum "+sum);
}}


class Fact{
public double facto(double i){
	double ans=1;
for (double j=1; j<=i ;j++)
	{
	ans=ans*j;
	}
return ans;
}
}