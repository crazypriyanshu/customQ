package com.qProject.queue.InterviewProblems.designPatterns.prototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy implements Prototype{
    private String name;
    private List<String> dataList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }

    public DeepCopy(String name, List<String> dataList){
        this.name = name;
        this.dataList = new ArrayList<>(dataList);
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "name='" + name + '\'' +
                ", dataList=" + dataList +
                '}';
    }

    @Override
    public Prototype clone() {
        return new DeepCopy(this.name, new ArrayList<>(this.dataList));
    }
}
