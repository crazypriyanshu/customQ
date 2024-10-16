package com.qProject.queue.InterviewProblems.functionalInterfaces.staticInitializer;

public class InitializerAndConstructor {

    public InitializerAndConstructor(){
        System.out.println(" parameter less");
    }

    public InitializerAndConstructor(String name){
        System.out.println(" Parametrized with : "+ name);
    }
    {
        System.out.println("This is a shared code");
    }

    public static void main(String[] args) {
        new InitializerAndConstructor();
        new InitializerAndConstructor("Priyanshu");
    }
}
