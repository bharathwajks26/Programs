import java.util.Scanner;
public class circle
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
double r =input.nextDouble();
double a=3.14*r*r;
double c=2*3.14*r;
System.out.println("area "+a);
System.out.println("circumference "+c);
}
}
