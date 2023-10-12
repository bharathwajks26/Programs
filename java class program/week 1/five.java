import java.io.*;
import java.util.Scanner;
public class five
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
System.out.println("value1 ");
int a =input.nextInt();
System.out.println("value2 ");
int b =input.nextInt();
System.out.println("value 3");
int c =input.nextInt();
System.out.println("value 4");
int d =input.nextInt();
System.out.println("value 5");
int e =input.nextInt();
int z=a+b+c+d+e;
int av=z/5;
System.out.println("sum "+z);
System.out.println("avg "+av);
}
}
