package com.qProject.queue.InterviewProblems.practice.hashCodeAndEqualsContract;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A a1 = new A();
        a1.num = 20;
        a1.val = "A";

        a.num = 20;
        b.numB = 20;


        a.val = "A";
        b.valueB = "A";


        if (a.equals(a1)){
            System.out.println(" equals because A = "+ a.hashCode() + " and a1 = "+a1.hashCode());
        }
        else System.out.println("not equals because A = "+ a.hashCode() + " and a1 = "+a1.hashCode());

        HashMap<Object, String> hm = new HashMap<>();
        hm.put(a, "Data for A");
        hm.put(a1, "Data of A1");
        String data = hm.get(b);
        //DEBUG

    }
}
