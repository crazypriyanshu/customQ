package com.qProject.queue.InterviewProblems.misc;

import java.util.HashSet;
import java.util.Set;

public class ImmuteClient {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(5);
        ImmutableClass immutableClass = new ImmutableClass(1, "Amit", set);
        set.add(3);
        int num = immutableClass.getId();
        String name = immutableClass.getName();
        Set<Integer> objSet = immutableClass.getSet();
        objSet.add(21);
        System.out.println("Num "+num+" and name "+name+ " set contents "+objSet);
        name = "vv";
        num = 4;
        System.out.println("Num "+immutableClass.getId()+" and name "+immutableClass.getName()+ " set contents "+immutableClass.getSet());
    }
}
