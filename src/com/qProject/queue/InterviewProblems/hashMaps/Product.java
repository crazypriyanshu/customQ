package com.qProject.queue.InterviewProblems.hashMaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
    private String name;
    private String description;
    private List<String> tags;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Product addTagsOfOtherProduct(Product product){
        this.tags.addAll(product.getTags());
        return this;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }


}
