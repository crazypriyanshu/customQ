package com.qProject.queue.InterviewProblems.patternMatching;

public class Animal {
    Animal(){
        this.name = "";
        this.type = -1;
    }
    Animal(String name, Integer type){
        this.name = name;
        this.type = type;
    }

    private String name;
    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


}
