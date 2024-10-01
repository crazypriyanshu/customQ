package com.qProject.queue.InterviewProblems.basics;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Priyanshu");
        sb.append("Das");

        String s = new String("Urvi");
        String myString = s.concat("Majumder");

        System.out.println(s.toString());
        System.out.println(sb.toString());

        StringBuilder stringBuilder = new StringBuilder("Charlie");
        stringBuilder.append(new String("Danny"));
        System.out.println(stringBuilder.toString());

    }

}
