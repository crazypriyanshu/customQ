package com.qProject.queue.InterviewProblems.designPatterns.SingletonDesign;

public class EagerSingleton {
    // create a private static final instance of Singleton class
    private static final EagerSingleton instance = new EagerSingleton();

    // making constructor final
    private EagerSingleton(){
        // your wish
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

// pros : simple to implement
// cons: instance is created even if its never used
