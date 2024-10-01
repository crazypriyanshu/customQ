package com.qProject.queue.InterviewProblems.tes;

import java.util.ArrayList;
import java.util.Spliterator;
import java.math.*;
public class SpiltIterartorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println("contents of the al are: ");
        Spliterator<Integer> spliterator = al.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));
    }
}
