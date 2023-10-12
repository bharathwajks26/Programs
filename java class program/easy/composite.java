import java.util.Scanner;

public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the n2: ");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            boolean isComposite = false;
            for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
                if (isComposite) {
                    System.out.print(i + " ");
                }
            
        }
        sc.close();
    }
}