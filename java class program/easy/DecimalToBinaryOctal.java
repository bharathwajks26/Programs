import java.util.Scanner;

public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNum = sc.nextInt();
        String binaryNum = Integer.toBinaryString(decimalNum);
        String octalNum = Integer.toOctalString(decimalNum);
        System.out.println("Binary Number = " + binaryNum);
        System.out.println("Octal = " + octalNum);
        sc.close();
    }
}