import java.util.ArrayList;
import java.util.Scanner;

public class NumberAndSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper range: ");
        int upper = sc.nextInt();
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i = lower; i <= upper; i++) {
            int[] array = {i, i * i};
            list.add(array);
        }

        // Iterate through the ArrayList and print each element
        for (int[] array : list) {
            System.out.printf("{" + array[0] + ",%d}\n ",array[1]);
        }

        sc.close();
    }
}
