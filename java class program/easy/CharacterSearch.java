import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to be searched: ");
        char c = scanner.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                System.out.println(c + " is found in string at index: " + i);
                found = true;
                break; // Exit the loop once the character is found
            }
        }

        if (!found) {
            System.out.println(c + " is not found in the string.");
        }

        scanner.close();
    }
}
