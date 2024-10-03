package com.qProject.queue.InterviewProblems.streams.example;

public class Elephant extends Animal{
    Elephant(Integer strength, Integer age) {
        super(strength, age);
        this.name = "Elephant";
    }
    private String name;

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", age=" + age +
                '}';
    }

    @Override
    public String eat() {
        return "Elephant is eating";
    }

    @Override
    public String breathe() {
        return "Elephant is breathing";
    }
}
