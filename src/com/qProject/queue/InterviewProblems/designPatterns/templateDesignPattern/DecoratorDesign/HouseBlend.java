package com.qProject.queue.InterviewProblems.designPatterns.templateDesignPattern.DecoratorDesign;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.35;
    }
}
