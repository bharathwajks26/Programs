import java.util.Scanner;
public class test1 {
    public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
System.out.println("Enter new username");
String x =input.nextLine();
System.out.println("Enter user name to check");
String y =input.nextLine();
if (x.equals(y))
{ 
    System.out.println("Correct Username");
}
else
{
    System.out.println("incorrect Username");
}
}
}
