package com.qProject.queue.InterviewProblems.designPatterns.templateDesignPattern.DecoratorDesign;
// main component
public abstract class Beverage {
    String description = "unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
