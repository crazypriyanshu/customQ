package com.qProject.queue;

import java.util.concurrent.BlockingQueue;

public class Producers implements Runnable{
    private BlockingQueue<String> queue;

    public Producers(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                String message = "I am message "+ i;
                queue.put(message);
                System.out.println(Thread.currentThread().getName() + " produced:  "+ message);
                Thread.sleep(100); // simulating a delay of 100 ms - some work being done

            }
            queue.put("END");
            System.out.println("In producer");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();

        }

    }
}
