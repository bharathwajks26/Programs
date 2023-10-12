import java.util.*;

class revstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        char[] word = input.toCharArray();
        int len = word.length;

        for (int i = 0; i < len / 2; i++) {
            char temp = word[i];
            word[i] = word[len - 1 - i];
            word[len - 1 - i] = temp;
        }

        String reversedWord = new String(word);
        System.out.println("The reversed string:\n" + reversedWord);
        s.close();
    }
}
