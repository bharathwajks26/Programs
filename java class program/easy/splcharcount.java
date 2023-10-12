import java.util.Scanner;

public class splcharcount{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = s.nextLine();

        int co = 0;

        System.out.println("Special characters in the line:");

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                System.out.println(c);
                co++;
            }
        }
System.out.println("Number of special characters: " + co);
s.close();

    }
}
