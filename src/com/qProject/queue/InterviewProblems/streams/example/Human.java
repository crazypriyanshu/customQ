package com.qProject.queue.InterviewProblems.streams.example;

public class Human extends Animal{
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", age=" + age +
                '}';
    }

    Human(Integer strength, Integer age) {
        super(strength, age);
        this.name = "Human";
    }
    private String name;

    @Override
    public String eat() {
        return "Humans is eating a lot...";
    }

    @Override
    public String breathe() {
        return "More carbon footprints";
    }
}
