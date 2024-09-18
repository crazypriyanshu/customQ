package com.qProject.queue;

import java.util.concurrent.BlockingQueue;

public class Consumers implements Runnable{
    private BlockingQueue<String> queue;

    public Consumers(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            while (true) {
                String message = queue.take();
                if(message.equals("END")) {
                    System.out.println(Thread.currentThread().getName()+ " received termination signal.");
                    queue.put("END");
                    break;
                }
                System.out.println(Thread.currentThread().getName()+ " has consumed "+ message);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }
}
