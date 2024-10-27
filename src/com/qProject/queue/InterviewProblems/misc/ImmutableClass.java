package com.qProject.queue.InterviewProblems.misc;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableClass {
    private int id;



    private String name;

    public Set<Integer> getSet() {
        return new HashSet<>(set);
    }

    private Set<Integer> set = new HashSet<>();

    public ImmutableClass(int id, String name, Set<Integer> set) {
        this.id = id;
        this.name = name;
        this.set = new HashSet<>(set);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
