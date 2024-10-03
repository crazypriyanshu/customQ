package com.qProject.queue.InterviewProblems.patternMatching;

import java.util.List;
import java.util.Random;

public class patternMatchingDemo {
    private static String process(Object object){
        return switch (object){
            case null -> "You need to enter something re Baba!";
            case Integer i -> "I have to say this a lucky number "+i;
            case String str -> "I got a string of length: "+str.length();
            case Double dbl -> "I am doubling you , i will call you: "+doubleLogic(dbl);
            case Animal an -> "I see you are an animal called "+an.getName()+" of strength: "+an.getType();
            default -> "whatever! I don't understand you";
        };

    }

    private static String doubleLogic(Double dbl){
        var ch = List.of("Amit", "Balak", "chasmih", "Rita");
        Random random = new Random();
        int ran = random.nextInt(4);
        return ch.get(ran);

    }
    public static void main(String[] args) {
        System.out.println(process(1));
        System.out.println(process("Two"));
        System.out.println(process(1.0));
        Animal elephant = new Animal("Elephant", 1);
        Animal tiger = new Animal("Tiger", 5);
        Animal human = new Animal("Human", 10);
        System.out.println(process(tiger));
    }
}
