package com.qProject.queue.InterviewProblems.basics;


public final class ImmutableClass {
    private int i;
    ImmutableClass(int i){
        this.i = i;
    }
    public ImmutableClass modify(int i) {
        if(this.i == i){
            return this;
        }
        else {
            return new ImmutableClass(i);
        }
    }
}
