import java.util.ArrayList;
import java.util.Collections;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 4};
        int[] array2 = {1, 3, 2};
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < array1.length; i++) {
            list1.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            list2.add(array2[i]);
        }
        list1.addAll(list2);

        // Sort the merged ArrayList
        Collections.sort(list1);

        System.out.println(list1);
    }
}
