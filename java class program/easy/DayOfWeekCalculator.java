import java.util.*;
public class DayOfWeekCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date (DD/MM/YYYY): ");
        String input = sc.nextLine();
        String[] parts = input.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        sc.close();

        // Create a Calendar instance and set the date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Month is 0-based, so subtract 1

        // Get the day of the week as an integer (1 = Sunday, 2 = Monday, etc.)
        int Int = calendar.get(Calendar.DAY_OF_WEEK);

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String a = daysOfWeek[Int - 1];

        System.out.println("Day of the week: " + a);
    }
}
