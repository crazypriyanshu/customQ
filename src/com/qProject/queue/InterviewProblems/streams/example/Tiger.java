package com.qProject.queue.InterviewProblems.streams.example;

public class Tiger extends Animal{
    Tiger(Integer strength, Integer age) {
        super(strength, age);
        this.name = "Tiger";
    }
    private String name;

    @Override
    public String eat() {
        return "Tiger is eating";
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                '}';
    }

    @Override
    public String breathe() {
        return "Tiger is breathing";
    }
}
