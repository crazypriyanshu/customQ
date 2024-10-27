package com.qProject.queue.InterviewProblems.designPatterns.SingletonDesign;

import java.io.Serializable;

public class Samosa implements Serializable {
    private static Samosa samosa;

    private Samosa(){

    }

    public static Samosa getSamosa(){
        if(samosa == null){
            synchronized (Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }
    public Object readResolve() {
        return samosa;

    }
}
