package com.qProject.queue.InterviewProblems.designPatterns.SingletonDesign;

public class LazyInitialization {
    // declare instance, but not initialize it
    private static LazyInitialization instance;
    private LazyInitialization(){
        // your  wish
    }
    // provide the way to world to access your singleton instance
    public static LazyInitialization getInstance(){
        if (instance == null){
            instance = new LazyInitialization();
        }

        return instance;
    }
    // this becomes the instance
}
// pro: instance created only when it is needed
// cons: not thread safe