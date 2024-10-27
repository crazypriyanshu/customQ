package com.qProject.queue.InterviewProblems.practice.hashCodeAndEqualsContract;

import java.util.Objects;

public class A {
    // OBJECT

    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    String val;

    @Override
    public boolean equals(Object object){
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != getClass()){
            return false;
        }
        A a = (A) object;
        return num == a.num && val.equals(a.val);
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(num, val));
        return Objects.hash(num, val);
    }
}
