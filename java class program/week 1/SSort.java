import java.util.Scanner;

public class SSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String b = s.nextLine();

        char[] a = b.toCharArray();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted string: ");
        for (char i : a) {
            System.out.print(i);
        }
    }
}
