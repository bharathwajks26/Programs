import java.util.Scanner;

public class EvenSumFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum = 0, a = 0, b = 1;
        System.out.print(b+" ");
        for (int i = 1; i < n; i++) {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            if (c % 2 == 0) {
                sum += c;
            }
        }
        System.out.println("\nEven sum of Fibonacci series till number " + n + " is: " + sum);
        sc.close();
    }
}