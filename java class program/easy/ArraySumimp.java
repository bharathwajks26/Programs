import java.util.Scanner;

public class ArraySumimp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int[] numbers = new int[N];

        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            try {
                sum += numbers[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Loop variable went beyond the size of the array");
                sc.close();
                return;
            }
        }

        System.out.println("Sum of the numbers: " + sum);
        sc.close();
    }
}
