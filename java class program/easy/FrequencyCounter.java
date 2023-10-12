public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        System.out.println("Element | Frequency");
        System.out.println("--------------------------");

        for (int i = 0; i < arr.length; i++) {
            int frequency = 1;

            // Check if this element has already been counted
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    frequency++;
                    // Mark the element as processed to avoid counting it again
                    arr[j] = 0;
                }
            }

            // Print the element and its frequency
            if (arr[i] != 0) {
                System.out.println(arr[i] + "\t|\t" + frequency);
            }
        }
    }
}
