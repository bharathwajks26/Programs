import java.util.Scanner;

public class recFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
        sc.close();
    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}