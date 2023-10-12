import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date (MM/DD/YYYY): ");
        String input = sc.nextLine();
        sc.close();

        int year;

        try {
            // Extract the year from the input and convert it to an integer
            year = Integer.parseInt(input.split("/")[2]);

            // Check if the year is a leap year
            boolean isLeapYear = isLeapYear(year);

            // Display the result
            if (isLeapYear) {
                System.out.println("Given year is a Leap Year");
            } else {
                System.out.println("Given year is a Non Leap Year");
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Handle exceptions related to invalid input format
            System.out.println("Invalid input format. Please enter a valid date in MM/DD/YYYY format.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100, unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
