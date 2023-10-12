import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        sc.close();

        String binary = "";

        if (decimal == 0) {
            binary = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary = remainder + binary; // Prepend the remainder to the binary string
                decimal /= 2; // Divide by 2 to get the next bit
            }
        }

        System.out.println("Binary representation: " + binary);
    }
}
