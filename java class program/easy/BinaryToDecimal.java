import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        sc.close();

        int decimal = Integer.parseInt(binaryString, 2);

        System.out.println("Decimal representation: " + decimal);
    }
}
