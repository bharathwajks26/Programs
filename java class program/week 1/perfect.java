import java.util.*;

public class perfect{
public static void main(String args[]){
int n,i,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=0;i<n;i++);
{
if(n%i==0)
{
sum=sum+i;
}
}

if(n==sum)
{
System.out.println("perfect number");
}
else
{
System.out.println("not perfect number");
}

}}