package com.qProject.queue.InterviewProblems.streams;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList( 4, 5, 7, 2, 6);
        System.out.println(nums);
        int sum = 0;
//        for (int num: nums) {
//            if (num%2 == 0){
//                num = num*2;
//                sum += num;
//            }
//        }
//        System.out.println(sum);
        nums.forEach(n -> System.out.println(n));

        // learn functional interface
        MyFunctionalInterface myFunctionalInterface = s -> {
            return s+" added with "+s.length()+" length at time: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:MM:SS:YYYY:MM"));
        };
        System.out.println(myFunctionalInterface.getString("Chaman"));

        List<Integer> myIntegersList = List.of(5, 7, 81, 92, 45);

    }

}
