package com.qProject.queue.InterviewProblems.designPatterns.SingletonDesign;

public class BigPughSigletonDesign {
    private static boolean instanceCreated = false;

    private BigPughSigletonDesign() {

        if (instanceCreated){
            throw new RuntimeException("Use getInstance method to create");
        }
        instanceCreated = true;
    }

    private static class SingletonHelper{
        private static final BigPughSigletonDesign INSTANCE = new BigPughSigletonDesign();
    }

    public static BigPughSigletonDesign getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
