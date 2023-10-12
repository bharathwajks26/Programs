import java.util.Scanner;

class BankAccount {
    String depositorName;
    int accountNumber;
    String accountType;
    double balance;

    BankAccount(String name, int accNumber, String accType, double initialBalance) {
        depositorName = name;
        accountNumber = accNumber;
        accountType = accType;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (balance - amount >= 500.00) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Minimum balance must be Rs.500.00");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter depositor name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter account type (Savings/Current): ");
        String accType = sc.nextLine();

        BankAccount account = new BankAccount(name, accNumber, accType, 10000.00);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();

        sc.close();
    }
}
