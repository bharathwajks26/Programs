class MultiplicationTable extends Thread {
    private int num;

    public MultiplicationTable(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("exit");
            }
        }
    }
}

public class threadimp {
    public static void main(String[] args) {
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table10 = new MultiplicationTable(10);
        table5.start();
        table10.start();
    }
}