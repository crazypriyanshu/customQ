package com.qProject.queue.InterviewProblems.designPatterns.SingletonDesign;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null){ // first check
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null){ // second check
                    instance = new ThreadSafeSingleton();
                }

            }
        }
        return instance;
    }
}
