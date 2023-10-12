import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        int income = sc.nextInt();
        int taxableIncome = income - 150000;
        double tax = 0;
        if (taxableIncome <= 0) {
            tax = 0;
        } else if (taxableIncome <= 150000) {
            tax = taxableIncome * 0.1;
        } else if (taxableIncome <= 350000) {
            tax = 15000 + (taxableIncome - 150000) * 0.2;
        } else if (taxableIncome <= 500000) {
            tax = 45000 + (taxableIncome - 350000) * 0.3;
        } else {
            tax = 105000 + (taxableIncome - 500000) * 0.4;
        }
        System.out.println("Tax = " + tax);
        sc.close();
    }
}