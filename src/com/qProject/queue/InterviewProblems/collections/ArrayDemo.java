package com.qProject.queue.InterviewProblems.collections;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: "+ al.size());

        // add elements
        al.add("H");
        al.add("E");
        al.add("L");
        al.add("L");
        al.add("O");

        al.add(1, "A1");

        System.out.println("AFter processing size of al: "+ al.size());
        for (int i =0; i< al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println();
        al.remove("L");
        al.remove(1);
        System.out.println("COntents of al :"+al);
        System.out.println("AFter removing size of al: "+ al.size());
        for (int i =0; i< al.size(); i++) {
            System.out.println(al.get(i));
        }


    }
}
