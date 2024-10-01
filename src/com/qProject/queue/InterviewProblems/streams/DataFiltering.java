package com.qProject.queue.InterviewProblems.streams;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee> {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.age);
    }
}
public class DataFiltering {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 25),
                new Employee("Ted", 45),
                new Employee("Jahnvi", 23),
                new Employee("Urvi", 29)
        );

        List<String> names = employees.stream()
                .filter(e -> e.age > 23)
                .sorted()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        List<Integer> ages = employees.stream()
                .map(Employee::getAge)
                .collect(Collectors.toList());
        System.out.println(ages);


        List<String> namesWithJ = employees.stream()
                .filter(s -> s.name.startsWith("J"))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(namesWithJ);

        Integer sumOfAges = employees.stream()
                .filter(e -> e.getAge() >= 25 && e.getName().startsWith("J"))
                .mapToInt(Employee::getAge)
                .sum();
        System.out.println(sumOfAges);
    }



}
