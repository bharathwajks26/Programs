import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        char[] l = word.toCharArray();
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] < l[j]) {
                    char temp = l[i];
                    l[i] = l[j];
                    l[j] = temp;
}}}
        String rev = new String(l);
        System.out.println("Alphabetical Order: " + rev);
        scanner.close();
    }
}
