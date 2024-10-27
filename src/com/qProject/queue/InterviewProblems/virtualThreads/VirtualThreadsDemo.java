package com.qProject.queue.InterviewProblems.virtualThreads;

import java.util.concurrent.Executors;

public class VirtualThreadsDemo {

    public static void platformThreads() {
        Thread.ofPlatform().start(() -> System.out.println(Thread.currentThread().getName()));

    }

    public static void virtualThreads() {
        Thread.startVirtualThread(() -> System.out.println(Thread.currentThread().getName()));
    }

    public static void virtualThreadExample() {
        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));

        }
    }
    public static void main(String[] args) {
//        platformThreads();
//        virtualThreads();
        virtualThreadExample();
    }
}