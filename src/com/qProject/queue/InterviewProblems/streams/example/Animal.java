package com.qProject.queue.InterviewProblems.streams.example;

public class Animal {
    Integer strength;
    Integer age;

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    Animal(Integer strength, Integer age){
        this.age = age;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "strength=" + strength +
                ", age=" + age +
                '}';
    }

    public String eat(){
        return " ";

    }
    public String breathe(){
        return " ";
    }
}
