package dsa.datastructures.dequeue;

import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeDemo {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>(1);

        Thread producer = new Thread(() -> {
            try {
                System.out.println("[Producer] Trying to put: A");
                deque.put("A");
                System.out.println("[Producer] Successfully put: A");

                System.out.println("[Producer] Trying to put: B (will block since deque is full)");
                deque.put("B");
                System.out.println("[Producer] Successfully put: B (after space was freed)");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("[Consumer] Taking from deque...");
                String value = deque.take();
                System.out.println("[Consumer] Took: " + value);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
