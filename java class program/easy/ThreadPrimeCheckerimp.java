class PrimeChecker implements Runnable {
    private int num;

    public PrimeChecker(int num) {
        this.num = num;
    }

    public void run() {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}

public class ThreadPrimeCheckerimp {
    public static void main(String[] args) {
        int n = 5;
        PrimeChecker checker = new PrimeChecker(n);
        Thread t = new Thread(checker);
        t.start();
    }
}