import java.util.Scanner;

public class UniquePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Permutations are:");
        String l = Integer.toString(number);
        int n = l.length();
        boolean[] u = new boolean[n];
        gp("", l, u, n);
    }
    public static void gp(String c, String l, boolean[] u, int n) {
        if (c.length() == n) {
            System.out.println(c);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!u[i]) {
                u[i] = true;
                gp(c + l.charAt(i), l, u, n);
                u[i] = false;
            }
        }
    }
}
