import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        System.out.println("Square Root: " + (int)sqrt + ", " + -(int)sqrt);
        sc.close();
    }
}