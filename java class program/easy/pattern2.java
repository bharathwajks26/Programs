import java.util.*;
public class pattern2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
		// i loop : iterating n times
        for (int i = 1; i <= n; i++)
        {
            int c = 1;
        	// j loop : iterating n-i times
            for (int j = 1; j <= n-i; j++)
                System.out.print(" "); 
        	// j loop : iterating i times
            for (int j = 1; j <= i; j++)
            {
                // Printing the numbers
                System.out.print(c + " "); 
                c = c * (i - j) / j;
            }
            System.out.println();
        }
        sc.close();
    }
}
