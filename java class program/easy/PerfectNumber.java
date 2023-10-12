import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given Number1: ");
        int n1 = sc.nextInt();
        System.out.print("Given Number2: ");
        int n2 = sc.nextInt();
        sc.close();

        if (n1 < 1 || n2<1) {
            System.out.println("Please enter a positive integer.");
        }
        else {
            
            for (int j=n1;j<n2;j++){
                int sum = 0;
            for (int i= 1; i <= j / 2; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j) {
                System.out.println(j);
        }           
        }
    }
}
}
