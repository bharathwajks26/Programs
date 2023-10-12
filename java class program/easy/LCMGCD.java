import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N value: ");
        int n = scanner.nextInt();
        System.out.print("Number 1 = ");
        long lcm = scanner.nextLong();
        long gcd = lcm;

        for (int i = 1; i < n; i++) {
            System.out.print("Number " + (i + 1) + " = ");
            long num = scanner.nextLong();

            // Calculate GCD using the Euclidean algorithm
            long a = gcd;
            long b = num;
            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            gcd = a;

            // Calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
            lcm = (lcm * num) / gcd;
        }

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
        scanner.close();
    }
}
