import java.util.Scanner;

class InterestCalculator {
    double principal;
    double rate;
    double time;

    public double calculateSimpleInterest() {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public double calculateCompoundInterest() {
        double amount = principal * Math.pow(1 + (rate / 100), time);
        double interest = amount - principal;
        return interest;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        // Create an instance of InterestCalculator
        InterestCalculator calculator = new InterestCalculator();
        calculator.principal = principal;
        calculator.rate = rate;
        calculator.time = time;

        // Calculate and display simple interest
        double simpleInterest = calculator.calculateSimpleInterest();
        System.out.println("Simple Interest: " + simpleInterest);

        // Calculate and display compound interest
        double compoundInterest = calculator.calculateCompoundInterest();
        System.out.println("Compound Interest: " + compoundInterest);

        input.close();
    }
}
