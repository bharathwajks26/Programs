import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sortedWord = new String(chars);
        String reverseSortedWord = new StringBuilder(sortedWord).reverse().toString();
        System.out.println("Alphabetical Order: " + reverseSortedWord);
        sc.close();
    }
}