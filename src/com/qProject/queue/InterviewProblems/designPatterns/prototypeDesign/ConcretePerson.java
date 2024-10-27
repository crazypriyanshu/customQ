package com.qProject.queue.InterviewProblems.designPatterns.prototypeDesign;

public class ConcretePerson implements Prototype {
    private String name;
    public ConcretePerson(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePerson(this.name); // create shallow copy
    }
}
