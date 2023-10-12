import java.util.*;

class Sum1 {
    public static void main(String args[]) {
        Sum x = new Sum();
        x.add();
    }
}

class Sum {
    int x, y;

    public void add() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print(a + b);
    }
}

