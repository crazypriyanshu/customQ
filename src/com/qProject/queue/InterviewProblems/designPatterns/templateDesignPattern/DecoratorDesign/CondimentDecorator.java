package com.qProject.queue.InterviewProblems.designPatterns.templateDesignPattern.DecoratorDesign;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();

}
