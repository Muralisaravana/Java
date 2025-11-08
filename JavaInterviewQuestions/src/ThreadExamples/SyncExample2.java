package ThreadExamples;

class Counting {
    int count = 0;

    // synchronized ensures only one thread runs this at a time
    synchronized void increment() {
        count++;
    }
}

public class SyncExample2 {
    public static void main(String[] args) throws InterruptedException {
        Counting c = new Counting();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count is: " + c.count);
    }
}
