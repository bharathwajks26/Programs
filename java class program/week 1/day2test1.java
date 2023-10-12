import java.util.Scanner;
public class day2test1
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
System.out.println("name");
String x =input.nextLine();
System.out.println("reg no");
int y =input.nextInt();

System.out.println("enter five sub mark");
int a =input.nextInt();
int b =input.nextInt();
int c =input.nextInt();
int d =input.nextInt();
int e =input.nextInt();

if (a>50 && b>50 && c>50 && d>50 && e>50)
{
int av=(a+b+c+d+e)/5;	
System.out.println("the average"+av);
if(av>90)
{
System.out.print("Grade S");
}
if(av>81 && av<=90)
{
System.out.print("Grade A");
}
if(av>71 && av<=80)
{
System.out.print("Grade B");
}
if(av>61 && av<=70)
{
System.out.print("Grade C");
}
if(av>51 && av<=60)
{
System.out.print("Grade D");
}
if(av<50)
{
System.out.print("Grade B");
}
}

else
{
System.out.println("not pass in all");
}


}
}
