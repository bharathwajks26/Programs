class Fibonacci implements Runnable {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public void run() {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
    }
}

public class ThreadFibonacciimp {
    public static void main(String[] args) {
        int n = 10;
        Fibonacci fib = new Fibonacci(n);
        Thread t = new Thread(fib);
        t.start();
    }
}