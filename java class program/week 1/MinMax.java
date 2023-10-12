import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        
        int[] array = new int[size];

        System.out.print("Elements ");
	for (int i = 0; i < size; i++) {
            
            array[i] = s.nextInt();
        }

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        int su= max + min;
        int d= max - min;

        // Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Sum: " + su);
        System.out.println("Difference: " + d);
    }
}
