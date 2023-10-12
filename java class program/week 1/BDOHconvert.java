import java.util.Scanner;
public class BDOHconvert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = s.nextLine();
        int deci = 0;
        int p = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            deci += digit * Math.pow(2, p);
            p++;
        }
        System.out.println("deci: " + deci);
        int octal = 0;
        int mul = 1;
        int temp = deci;
        while (temp != 0) {
            octal += (temp % 8) * mul;
            temp /= 8;
            mul *= 10;
        }
        System.out.println("Octal: " + octal);
        String hexdec = "";
        temp = deci;
        while (temp != 0) {
            int r = temp % 16;
            char hexd = gethexd(r);
            hexdec = hexd + hexdec;
            temp /= 16;
        }
        System.out.println("hexdec: " + hexdec);
    }
    private static char gethexd(int value) {
        if (value >= 0 && value <= 9) {
            return (char) ('0' + value);
        } else {
            return (char) ('A' + value - 10);
        }
    }
}
