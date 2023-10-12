import java.util.Scanner;

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();
        System.out.println("Perfect squares between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.print(i + " ");
            } }
              sc.close();
    }
}
