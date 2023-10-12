import java.util.Scanner;
public class whileloop
{
public static void main(String[] args)
{

Scanner input= new Scanner(System.in);
int n=input.nextInt();
int s=0;
int i=0;
while(i<n)
{
    i+=1;
    s=s+i;
}
System.out.println("value "+s);
}}
