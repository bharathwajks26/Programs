import java.util.Scanner;

public class bankaccountassign {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Account account = new Account(100.0);

        int choice;
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Compute Interest");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit: ");
                    double depositAmount = s.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Amount deposited");
                    break;

                case 2:
                    System.out.print("Enter withdraw: ");
                    double withdrawAmount = s.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Amount withdrawn");
                    break;

                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;

                case 4:
                    System.out.print("Enter rate: ");
                    double interestRate = s.nextDouble();
                    account.computeInterest(interestRate);
                    System.out.println("Interest computed");
                    System.out.println("Current balance: $" + account.getBalance());
                    break;

                default:
                    System.out.println("Invalid");
                    break;
            }
            s.close();
}}
class Account {
    double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }
    public Account() {
        balance = 0.0;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. $5 penalty charged.");
            balance -= 5.0; // Apply $5 penalty
        } else {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
    public double computeInterest(double interestRate) {
        double interest = balance * interestRate / 100;
        balance += interest;
        return balance;
    }
}
