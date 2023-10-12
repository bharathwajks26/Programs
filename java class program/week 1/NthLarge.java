import java.util.*;


public class NthLarge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = s.nextInt();

        int[] a = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

	for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }        




        int nthLargest = a[a.length - n];

        System.out.println("The " + n + "th largest number is: " + nthLargest);
    }
}
