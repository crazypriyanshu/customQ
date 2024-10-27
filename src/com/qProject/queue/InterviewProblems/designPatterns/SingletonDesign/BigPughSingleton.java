package com.qProject.queue.InterviewProblems.designPatterns.SingletonDesign;

public class BigPughSingleton {
    private boolean hasInstance = false;
    private BigPughSingleton() {
        // your code
        if(hasInstance){
            throw new RuntimeException("meaning the instance is created already, use getInstance method");
        }
        else {
            hasInstance = true;
        }
    }

    private static class SingletonHelper{
        private static final BigPughSingleton INSTANCE = new BigPughSingleton();
    }

    public static BigPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
