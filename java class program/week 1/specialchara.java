import java.util.Scanner;

public class specialchara {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter line ");
        String line = s.nextLine();
        int sec = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                sec++;
            }
        }

        System.out.println("special characters: " + sec);
    }
}
