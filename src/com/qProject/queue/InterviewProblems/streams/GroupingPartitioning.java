package com.qProject.queue.InterviewProblems.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Order {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;

    public Order(String id, String status) {
        this.id = id;
        this.status = status;
    }
}
public class GroupingPartitioning {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("001", "completed"),
                new Order("002", "pending"),
                new Order("003", "completed"),
                new Order("004", "completed"),
                new Order("005", "cancelled")
        );

        Map<String, List<Order>> orderByStaus = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus));
        System.out.println(orderByStaus.get(1));

        StringBuffer sb = new StringBuffer(10); // by default the capacity is 16
        System.out.println(sb.capacity());
        sb.append("abcdefghhijklmnopqur");
        System.out.println(sb.capacity()); // (10+1)*2 = 22
        StringBuffer sb1 = new StringBuffer(new String("durga"));
        System.out.println(sb1.capacity()); // 21 (default size+sizeOfString)
        System.out.println(sb1.length()); // 5
        System.out.println(sb1.charAt(3)); // r
        // System.out.println(sb1.charAt(30)); // String out of bound Exception
        sb1.setCharAt(2,'o');
        System.out.println(sb1); // duoga
        System.out.println(sb1.append("how").append(5).append(1.0).append(1011)); // duogahow51.01011
        System.out.println(sb1.insert(1, "1st")); // d1stuogahow51.01011
        System.out.println(sb1.delete(9, 10));
        System.out.println(sb1.deleteCharAt(3));
        sb1.setLength(5);
        System.out.println(sb1);





    }
}
