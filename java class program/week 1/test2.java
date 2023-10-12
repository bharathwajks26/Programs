import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("time period (in years): ");
        double time = scanner.nextDouble();
        
        System.out.print("senior citizen? (Y/N): ");
        String Senior = scanner.next();
        
        double interest;
        
        if (Senior.equals("Y")) {
            interest = (principal * time * 0.10) / 100 ;
        } else {
            interest = (principal * time * 0.12) / 100 ;
        }
        
        System.out.println("Simple interest: " + interest);
        
        scanner.close();
    }
}
