package dsa.datastructures.dequeue;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LockFreeDequePOC {

    static ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
    static AtomicInteger counter = new AtomicInteger(0);
    static final int TOTAL_TASKS = 10_000;
    static final int NUM_PRODUCERS = 4;
    static final int NUM_CONSUMERS = 4;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_PRODUCERS + NUM_CONSUMERS);

        long start = System.currentTimeMillis();

        for (int i = 0; i < NUM_PRODUCERS; i++) {
            executor.submit(() -> {
                for (int j = 0; j < TOTAL_TASKS / NUM_PRODUCERS; j++) {
                    deque.offer(j);
                }
            });
        }


        for (int i = 0; i < NUM_CONSUMERS; i++) {
            executor.submit(() -> {
                while (counter.get() < TOTAL_TASKS) {
                    Integer val = deque.poll();
                    if (val != null) {
                        counter.incrementAndGet();
                    }
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        long end = System.currentTimeMillis();
        System.out.println("Total Processed: " + counter.get());
        System.out.println("Time taken (ms): " + (end - start));
    }
}
