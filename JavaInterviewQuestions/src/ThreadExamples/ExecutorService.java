package ThreadExamples;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorService {

    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        java.util.concurrent.ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks (Runnable)
        for (int i = 1; i <= 5; i++) {
            int taskId = i; // effectively final for lambda
            executor.submit(() -> {
                System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                try {
                    // simulate work
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
            });
        }

        // Stop accepting new tasks
        executor.shutdown();

        try {
            // Wait for all tasks to finish
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // force shutdown if not done in time
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("All tasks finished. Main thread exiting.");
    }
}

