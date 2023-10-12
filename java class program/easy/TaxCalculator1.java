import java.util.Scanner;

public class TaxCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = sc.nextDouble();
        double taxableIncome = income - 250000;
        double tax = 0;
        if (taxableIncome <= 0) {
            tax = 0;
        } else if (taxableIncome <= 250000) {
            tax = taxableIncome * 0.1;
        } else if (taxableIncome <= 500000) {
            tax = 25000 + (taxableIncome - 250000) * 0.2;
        } else if (taxableIncome <= 1000000) {
            tax = 75000 + (taxableIncome - 500000) * 0.3;
        } else {
            tax = 225000 + (taxableIncome - 1000000) * 0.4;
        }
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax = " + tax);
        sc.close();
    }
}