import java.text.*;
import java.util.*;

public class SOperations {
    public static void main(String[] args) {
        // i. Compare two strings lexicographically, ignoring case differences.
        String str1 = "Hello";
        String str2 = "hello";
        boolean areEqual = str1.equalsIgnoreCase(str2);
        System.out.println("(ignoring case)? " + areEqual);

        // ii. Check whether a given string ends with the contents of another string.
        String mainS = "This is a test string";
        String endsWith = "string";
        boolean Content = mainS.endsWith(endsWith);
        System.out.println("\nDoes the main string end with the content of the second string? " + Content);

        // iii. Print current date and time in the specified format.
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String cu = date.format(new Date());
        System.out.println("Current date and time: " + cu);

        // iv. Get the index of all the characters of the alphabet.
        String sample = "The quick brown fox jumps over the lazy dog.";
        for (char c = 'a'; c <= 'z'; c++) {
            int index = sample.toLowerCase().indexOf(c);
            if (index != -1) {
                System.out.println("Index of '" + c + "': " + index);
            }
        }

        // v. Replace each substring of a given string that matches the given regular expression with the given replacement.
        String or = "The quick brown fox jumps over the lazy dog.";
        String replace = or.replaceAll("fox", "cat");
        System.out.println("Replaced string: " + replace);

        // vi. Get a substring of a given string between two specified positions.
        String inputString = "The quick brown fox jumps over the lazy dog.";
        int startPos = 10;
        int endPos = 21;
        String substring = inputString.substring(startPos, endPos);
        System.out.println("Substring between positions " + startPos + " and " + endPos + ": " + substring);

        // vii. Trim any leading or trailing whitespace from a given string.
        String space = "  Hello, World!   ";
        String trimmed = space.trim();
        System.out.println("Trimmed string: " + trimmed);

        // viii. Convert all the characters in a string to lowercase.
        String u = "HELLO, WORLD!";
        String l = u.toLowerCase();
        System.out.println("Lowercase string: " + l);

        // ix. Get the length of a given string.
        String len = "Hello, World!";
        int la = len.length();
        System.out.println("Length of the string: " + la);

        // x. Check whether two String objects contain the same data.
        String s1 = "The quick brown fox jumps over the lazy dog.";
        String s2 = "The quick brown fox jumps over the lazy dog.";
        boolean Data = s1.equals(s2);
        System.out.println("Do the strings contain the same data? " + Data);
    }
}
