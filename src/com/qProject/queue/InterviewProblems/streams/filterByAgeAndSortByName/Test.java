package com.qProject.queue.InterviewProblems.streams.filterAndSortByAge;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", 5));
        employees.add(new Employee("A", 1));
        employees.add(new Employee("A", 3));
        employees.add(new Employee("A", 4));
        employees.add(new Employee("A", 2));

        // print employees whose age is greater than 2

        List<Employee> results = employees.stream().filter(e -> e.getAge() > 2)

    }
}
