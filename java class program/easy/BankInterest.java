import java.util.Scanner;

class Bank {
    public double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    public double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    public double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Bank {
    public double getRateOfInterest() {
        return 9.7;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bank name (SBI/ICICI/AXIS): ");
        String bankName = sc.nextLine();
        Bank bank;
        switch (bankName) {
            case "SBI":
                bank = new SBI();
                break;
            case "ICICI":
                bank = new ICICI();
                break;
            case "AXIS":
                bank = new AXIS();
                break;
            default:
                System.out.println("Invalid bank name");
                sc.close();
                return;
        }
        double rate = bank.getRateOfInterest();
        System.out.println(bankName + " Rate of Interest: " + rate);
        sc.close();
    }
}