import java.util.Scanner;

public class ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();
        sc.close();

        int originalNumber = inputNumber;
        int reverse = 0;

        while (inputNumber != 0) {
            int digit = inputNumber % 10;
            reverse = reverse * 10 + digit;
            inputNumber /= 10;
        }

        inputNumber = originalNumber;

        while (inputNumber != reverse) {
            int sum = inputNumber + reverse;
            System.out.println(inputNumber + " + " + reverse + " = " + sum);

            inputNumber = sum;

            reverse = 0;
            int temp = inputNumber;
            while (temp != 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
        }

        System.out.println("Palindrome found: " + inputNumber);
    }
}
