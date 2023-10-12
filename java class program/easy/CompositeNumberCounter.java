public class CompositeNumberCounter {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        int count = 0;

        System.out.println("Array of elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            boolean isComposite = false;

            if (arr[i] <= 1) {
                isComposite = false;
            } else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
            }

            if (isComposite) {
                count++;
            }
        }

        System.out.println("\nNumber of Composite Numbers = " + count);
    }
}
