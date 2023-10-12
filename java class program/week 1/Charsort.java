import java.util.*;

public class Charsort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        char[] arr = new char[n];
        System.out.println("Enter the characters:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine().charAt(0);
        }

        // Sort the array using bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted characters:");

        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
