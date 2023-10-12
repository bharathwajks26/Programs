import java.util.Scanner;
public class day2test2
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
System.out.println("c.name");
String x =input.nextLine();
System.out.println("c.no");
int y =input.nextInt();

System.out.println("enter CMR AND LMR");
int a =input.nextInt();
int b =input.nextInt();
int av=b-a;

System.out.println("enter 1.domestic AND 2.industry ");
int c=input.nextInt();


switch (c) {
    case 1:
        if(av<=100)
	{
	System.out.print("Bill: 0");
	}
	if(av>101 && av<=200)
	{
	System.out.print("Bill: "+av*1);
	}
	if(av>201 && av<=300)
	{
	System.out.print("Bill: "+av*2);
	}
	if(av>301 && av<=500)
	{
	System.out.print("Bill: "+av*3.50);
	}
	if(av>500)
	{
	System.out.print("Bill: "+av*5);
	}
	break;
    case 2:
	if(av<100)
	{
	System.out.print("Bill:0");
	}
	if(av>101 && av<=200)
	{
	System.out.print("Bill: "+av*1.25);
	}
	if(av>201 && av<=301)
	{
	System.out.print("Bill: "+av*2.50);
	}
	if(av>301 && av<=500)
	{
	System.out.print("Bill: "+av*4.00);
	}
	if(av>500)
	{
	System.out.print("Bill: "+av*5.40);
	}
	break;
   default:
        System.out.println("invalid");
        break;
}


}
}

