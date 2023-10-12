import java.util.*;

public class meanmediamode {
    public static void main(String[] args) {
        int[] numbers = {16, 18, 27, 18, 23, 21, 19};

        int sum = 0;
        int mode = -1;

        Arrays.sort(numbers);

        // Calculate Mean, Median, and Mode
        int maxCount = 0;
        int cCount = 0;
        int cMode = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                cCount++;
                if (cCount > maxCount) {
                    maxCount = cCount;
                    cMode = numbers[i];
                }
            } else {
                cCount = 1;
            }

            sum += numbers[i];
        }

        int mean = sum / numbers.length;
        int median;
        int n = numbers.length;

        if (n % 2 == 0) {
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } else {
            median = numbers[n / 2];
        }

        // Set Mode
        if (maxCount > 1) {
            mode = cMode;
        }

        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }
}
