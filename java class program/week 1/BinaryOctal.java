import java.util.Scanner;

public class BinaryOctal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int Number = s.nextInt();

        int Copy = Number;

        String binary = "";
        while (Number > 0) {
            int r = Number % 2;
            binary = r + binary;
            Number /= 2;
        }

        String octal= "";
        while (Copy > 0) {
            int r = Copy % 8;
            octal = r + octal;
            Copy /= 8;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);

    }
}
