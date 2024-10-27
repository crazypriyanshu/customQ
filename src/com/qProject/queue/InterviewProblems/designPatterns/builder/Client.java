package com.qProject.queue.InterviewProblems.designPatterns.builder;

import java.util.*;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("V6", "Automatic").setNavigationSystem(true).setSunroof(true).build();
        Car car2 = new Car.CarBuilder("Chawani", "5000CC Jet").build();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        ArrayList<Integer> list = new ArrayList<>(List.of(2, 3, 88, 6, 11));
        List<Integer> chala =  list.stream()
                .map(q -> Math.abs(q)*q)
                .filter(a -> a%2 == 0)
                .collect(Collectors.toList());
        System.out.println(chala);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 5);
        map.put("C", 1);
        map.put("D", 4);
        map.put("E", 2);
        List<Map.Entry<String, Integer>> list1 = new ArrayList<>(map.entrySet());

    }
}
