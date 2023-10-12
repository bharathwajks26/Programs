import java.util.Scanner;

public class lowupnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = "";
        int l = 0, u = 0, num = 0;
        
        while (!n.equals("*")) {
            System.out.println("Enter a character: ");
            n = scanner.nextLine();
            
            if (n.length() == 1) {
                char ch = n.charAt(0);
                if (Character.isLowerCase(ch)) {
                    l++;
                } else if (Character.isUpperCase(ch)) {
                    u++;
                } else {
                    num++;
                }
            }
        }
        
        System.out.println("Lowercase count: " + l);
        System.out.println("Uppercase count: " + u);
        System.out.println("Numeric count: " + num);
    }
}
