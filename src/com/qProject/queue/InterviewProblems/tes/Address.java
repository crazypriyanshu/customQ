package com.qProject.queue.InterviewProblems.tes;

public class Address {
    private String name;
    private String city;
    private int num;

    Address(String name, String city, int num) {
        this.name = name;
        this.city = city;
        this.num = num;
    }

    @Override
    public String toString() {
        return name+"\n"+city+"\n"+num;
    }
}
