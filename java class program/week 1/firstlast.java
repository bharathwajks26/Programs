import java.util.Scanner;
public class firstlast
{   
    public static void main(String args[]) 
    {   
        Scanner input= new Scanner(System.in);
	System.out.println("enter n");
	int n=input.nextInt();
        int f = 0;
        int l = 0;
 
        l= n%10;
        System.out.println("Last digit: "+l);
 
        while(n!=0) {
            f= n%10;
            n /= 10;
        }
        System.out.println("First digit: "+f);
    }
}