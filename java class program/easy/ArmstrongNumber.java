import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int numOfDigits = 0;
        while (num > 0) {
            numOfDigits++;
            num /= 10;
        }
        num = originalNum;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println("Given number is Armstrong number");
        } else {
            System.out.println("Given number is not Armstrong number");
        }
        sc.close();
    }
}