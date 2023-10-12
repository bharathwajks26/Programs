import java.util.Scanner;

public class strtoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        try {
            int intValue = Integer.parseInt(inputString);
            System.out.println("Output Integer: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. The provided string is not a valid integer.");
        }
        
        scanner.close();
    }
}
