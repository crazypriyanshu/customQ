package com.qProject.queue.InterviewProblems.hashMaps;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class Practice1 {
    public static void main(String[] args) {
        Map<String, Product> productsByName = new HashMap<>();
        Product eBike = new Product("E-bike", "2A bike with battery");
        Product roadBike = new Product("Road-bike", "A bike for competition");
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        Product nextPurchase = productsByName.get("E-bike");
        Assert.assertEquals("2A bike with battery",nextPurchase.getDescription());

    }
}
