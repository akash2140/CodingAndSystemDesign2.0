package dsa.datastructures.dequeue;

import java.util.*;
import java.util.concurrent.*;

public class DequeAnalysis {

    public static void main(String[] args) throws InterruptedException {

        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(10);
        deque.addLast(50);

        //executorServcieAnalysis(deque);
    }

    private static void executorServcieAnalysis(Deque<Integer> deque) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor = Executors.newFixedThreadPool(5);

        executor.submit(
                ()->{
                    for(int i=0;i<100; i++) {
                        deque.push(10);
                    }
                });

        executor.submit(
                ()->{
                    deque.push(20);
                });

        executor.submit(
                ()->{
                    deque.push(30);
                });
        executor.submit(
                ()->{
                    deque.push(40);
                });

        executor.submit(
                ()->{
                    deque.push(50);
                });


        executor.shutdown();
        executor.awaitTermination(5000, TimeUnit.MILLISECONDS);

        deque.forEach((d)->{
            System.out.println(d);
        });
    }
}
