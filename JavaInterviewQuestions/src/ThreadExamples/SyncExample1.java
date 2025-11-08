package ThreadExamples;

class Counter {
    int count = 0; // shared resource

    // increment method - not synchronized
    void increment() {
        count++;
    }
}

public class SyncExample1 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Thread 1 increments 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        // Thread 2 increments 1000 times
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

