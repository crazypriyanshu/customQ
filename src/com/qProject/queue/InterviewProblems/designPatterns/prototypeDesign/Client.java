package com.qProject.queue.InterviewProblems.designPatterns.prototypeDesign;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Prototype person = new ConcretePerson("Amit");
        Prototype clonedPerson = person.clone();

        Prototype deepCopy = new DeepCopy("Ambi", List.of("aata", "daal", "chawal"));
        Prototype anothercopy = deepCopy.clone();

        System.out.println(deepCopy.toString());
        System.out.println(anothercopy.toString());
    }
}
