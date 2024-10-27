package com.qProject.queue.InterviewProblems.streams.filterByAgeAndSortByName;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", 5));
        employees.add(new Employee("B", 1));
        employees.add(new Employee("C", 3));
        employees.add(new Employee("D", 4));
        employees.add(new Employee("E", 2));

        // problem : we have a list of employees, i want employees whose age is greater than 2 and in sorted in ascending order by name

        // print employees whose age is greater than 2

        List<Employee> results = employees
                .stream()
                .filter(e -> e.getAge() > 2)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        for (Employee e: results){
            System.out.println(e.toString());
        }

        // find the max age person,
        Optional<Employee> max = employees
                .stream()
                .max(Comparator.comparing(Employee::getAge));
        System.out.println(" Max employee "+ max);
        // or
        List<Integer> listOfIntegers = Arrays.asList(3, 4, 5, 9, 1, 0, 11);
        Optional<Integer> maxAged = listOfIntegers
                .stream()
                        .reduce(Integer::max);
        System.out.println(maxAged.get());

        // convert a list to uppercase
        // use map to apply transformation
        System.out.println("*********** Transformation example to upper case **************");
        List<String> fruits = Arrays.asList("Apple", "Guava", "Banana", "Kiwi", "Mango");
        List<String> transformedFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        for (String s: transformedFruits){
            System.out.println(s);
        }
        System.out.println("***********************");

        // lets create a group of employees which has departments
        List<Employee> employeesList = Arrays.asList(
                new Employee("Ravi", 25, "A"),
                new Employee("Sunny", 23, "B"),
                new Employee("Chaube", 26, "A"),
                new Employee("Tharki", 21, "C"),
                new Employee("Ambu", 31, "A"),
                new Employee("Rubana", 32, "C")

        );
        Map<String, List<Employee>> empByDepratment = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(empByDepratment);

        // problem : Convert all the names to comma seperated list
        System.out.println("*********  names to comma separated list **********");
        String joined = employeesList.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(" joined value= "+ joined);
        System.out.println("*******************************");

        // getName
        List<String> collectedDepartment = employeesList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("************** collecvted depratment *****************");
        System.out.println(collectedDepartment);

        System.out.println("************** partition the employees based on even and odd age *****************");
        Map<Boolean, List<Employee>> partitioned = employeesList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 27));
        List<Employee> above27Aged = partitioned.get(true);
        List<Employee> below27Aged = partitioned.get(false);
        System.out.println("Employees with age > 27: "+ above27Aged);
        System.out.println("Employees with age < 27: "+ below27Aged);

        System.out.println();
        System.out.println();
        System.out.println("*************************** numbers **************************");
        List<Integer> duplicatAge = employeesList
                .stream()
                .map(Employee::getAge)
                .filter(s -> s > 23)
                .collect(Collectors.toList());
        for (Integer s: duplicatAge){
            System.out.println(s);
        }

        System.out.println("************** Find name with most number of characters **********");
        String longestName = employeesList.stream()
                .map(Employee::getName)
                .max(Comparator.comparingInt(String::length)).get();
        System.out.println(" Longest name " + longestName);




    }
}
