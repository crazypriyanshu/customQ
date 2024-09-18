package com.qProject.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class KafkaLikeQ {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

        Producers producer1 = new Producers(blockingQueue);
        Producers producer2 = new Producers(blockingQueue);
        Producers producer3 = new Producers(blockingQueue);

        Consumers consumer1 = new Consumers(blockingQueue);
        Consumers consumer2 = new Consumers(blockingQueue);
        System.out.println("Creating new threads");
        Thread t1 = new Thread(producer1, "Producer-1");
        Thread t2 = new Thread(producer2, "Producer-2");

        Thread t3 = new Thread(consumer1, "consumer-1");
        Thread t4 = new Thread(consumer2, "consumer-2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

    }
}
