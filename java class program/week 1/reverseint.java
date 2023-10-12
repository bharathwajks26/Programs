import java.util.Scanner;
public class reverseint
{
public static void main(String[] args)
{
Scanner input= new Scanner(System.in);
System.out.println("enter n");
int n=input.nextInt();

int i=0;
int s=0;
while(n>0)
{
i=n%10;
s=(s*10)+i;
n=n/10;
}
System.out.println("Value "+s);
}
}