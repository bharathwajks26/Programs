import java.util.Scanner;

public class CharacterSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the character to be searched: ");
        char ch = sc.next().charAt(0);
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.printf("%c is found in string at index: %d", ch, index);
        } else {
            System.out.printf("%c is not found in string", ch);
        }
        sc.close();
    }
}