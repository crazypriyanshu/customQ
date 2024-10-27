package com.qProject.queue.InterviewProblems.functionalInterfaces;

public interface CapitalizeFirst {
    static String cap(String name){
        var first = Character.toUpperCase(name.charAt(0));
        var rem = name.substring(1);
        return first+rem;
    }

    public static void main(String[] args) {
        System.out.println(cap("challenge"));
        var home = System.getenv().getOrDefault("JAVA_HOME", "Default val");
        System.out.println(home);
    }
}
