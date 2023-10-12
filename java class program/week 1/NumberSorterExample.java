
import java.io.*;
import java.util.*;

public class NumberSorterExample {
    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 2;
        int num3 = 8;

        NumberSorter sorter = new NumberSorter(num1, num2, num3);
        sorter.sortNumbers();
        int smallestNumber = sorter.getSmallestNumber();

        System.out.println("Sorted numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Smallest number: " + smallestNumber);
    }
}
class NumberSorter {
    private int[] numbers;

    public NumberSorter(int num1, int num2, int num3) {
        numbers = new int[3];
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
    }

    public void sortNumbers() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public int getSmallestNumber() {
        return numbers[0];
    }
}

