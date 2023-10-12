import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the no of years: ");
        double years = sc.nextDouble();
        System.out.print("Is customer senior citizen (y/n): ");
        char sen = sc.next().charAt(0);
        double rate = sen == 'y' ? 0.12 : 0.10;
        double t = p * years * rate;
        System.out.println("Interest: " + t);
        sc.close();
    }
}