import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4};

        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }

        System.out.println("Merged array: " + mergedList);
    }
}
