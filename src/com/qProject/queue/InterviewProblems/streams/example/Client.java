package com.qProject.queue.InterviewProblems.streams.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        Animal elephant = new Elephant(5, 50);
        Animal tiger = new Tiger(9, 40);
        Animal human = new Human(7, 60);

        List<Animal> animals = List.of(elephant, tiger, human);
        List<Integer> sums = animals
                .stream()
                .map(animal -> animal.strength + 5 )
                .collect(Collectors.toList());

        animals.stream()
                        .forEach(animal -> {
                            System.out.println(animal.breathe());
                            System.out.println(animal.eat());
                        });
        String sorted = animals.stream().sorted(Comparator.comparing(Animal::getStrength)).toList().toString();

        System.out.println();
        System.out.println(sums);
        System.out.println();
        System.out.println(sorted);
    }
}
