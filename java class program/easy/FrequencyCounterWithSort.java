import java.util.*;
public class FrequencyCounterWithSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 8, 3, 2, 3, 2, 5, 1};
        Arrays.sort(a);
        System.out.println("Element | Frequency");
        System.out.println("--------------------------");
        int i = 0;
        while (i < a.length) {
            int frequency = 1;
            while (i < a.length - 1 && a[i] == a[i + 1]) {
                frequency++;
                i++;
            }
            System.out.println(a[i] + "\t\t|\t\t" + frequency);
            i++;
        }
    }

}