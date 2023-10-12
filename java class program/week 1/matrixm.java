import java.util.Scanner;
public class matrixm
{
public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
int[][] x =new int[][];
int[][] x =new int[][];
char a =input.next().charAt(0);
int z;
switch (a) {
    case '+':
        z=x+y;
        System.out.println("value "+z);
        break;
    case '-':
        z=x-y;
        System.out.println("value "+z);
        break;    
    default:
        System.out.println("invalid");
        break;
}
}
}
