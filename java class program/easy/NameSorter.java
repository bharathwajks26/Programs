import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.print("Enter sorting order (A for ascending, D for descending): ");
        String sortOrder = scanner.nextLine();
        
        if (sortOrder.equalsIgnoreCase("A")) {
            Collections.sort(names); // Sort names in ascending order
        } else if (sortOrder.equalsIgnoreCase("D")) {
            Collections.sort(names, Collections.reverseOrder()); // Sort names in descending order
        }
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
}scanner.close();
    }
}
