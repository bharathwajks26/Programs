import java.io.*;
import java.util.Scanner;
public class area
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
double x =input.nextDouble();
double y =input.nextDouble();
y=y/100;
double a=x*y;
double c=2*(x+y);
System.out.println("area "+a);
System.out.println("circumference "+c);
}
}
