import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        // Convert the character to lowercase to handle both upper and lower case vowels
        ch = Character.toLowerCase(ch);

        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }

    public static boolean isVowel(char ch) {
        // Check if the character is one of the vowels (a, e, i, o, u)
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
         return true; }
         else{
            return false;
         }
    }
}
