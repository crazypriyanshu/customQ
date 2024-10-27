package com.qProject.queue.InterviewProblems.designPatterns.templateDesignPattern.DecoratorDesign;

public class Expresso extends Beverage{
    public Expresso() {
        description = "Expresso";
    }
    @Override
    public double cost() {
        return 0.25;
    }
}
