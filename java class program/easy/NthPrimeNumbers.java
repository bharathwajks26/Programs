import java.util.Scanner;

public class NthPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int count = 0;
        int number = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
            number++;
        }
        int nthPrime = number - 1;
        System.out.println(n + "th Prime number is " + nthPrime);
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        count = 0;
        number = nthPrime + 1;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        sc.close();
    }
}