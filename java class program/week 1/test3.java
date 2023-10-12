import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the annual income: ");
        double income = scanner.nextDouble();

        double deduction = 0.0;

        if (income <= 150000) {
            deduction = 0.0;
        } else if (income <= 300000 && income>150000) {
            deduction = income* 0.1;
        } else if (income <= 500000 && income >= 300000) {
            deduction = income* 0.2;

        } else {
            deduction = income * 0.3;
        }

        System.out.println("Tax Deduction: " + deduction);
	System.out.println("sal " + income - deduction);

        scanner.close();
    }
}
