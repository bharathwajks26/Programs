import java.io.*;
import java.util.Scanner;
public class opt
{
public static void main(String[] args)
{
int x=5,y=7,z=10;
x++;
y--;
z=x+y;
y=z--+x;
x=x-(--z);
z+=y;
z-=x;
x+=y;
System.out.println("value x "+x);
System.out.println("value y "+y);
System.out.println("value z "+z);
}
}
