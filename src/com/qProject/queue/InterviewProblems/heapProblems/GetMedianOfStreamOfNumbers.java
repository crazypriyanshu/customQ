package com.qProject.queue.InterviewProblems.heapProblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class GetMedianOfStreamOfNumbers {
    // given an array of streams - design a system to find the median of a point efficiently

    // approach - 2 heaps - minHeap and maxHeap
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public GetMedianOfStreamOfNumbers() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNumber(int num) {
        // Step 1: add to the max heap first (as it is the smaller half)
        maxHeap.offer(num);

        // Step 2: Balance the heaps, ensure every element in the max heap <= every element in min heap
        if(!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.offer(maxHeap.poll());
        }

        // Step 3: Balance sizes: Ensure maxHeap has at most 1 more element than minHeap
        if (maxHeap.size() > minHeap.size() + 1){
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        // if the size of the heaps are equal, the median is the average of two
        if (maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        // or else the max heap has 1 extra element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        GetMedianOfStreamOfNumbers median = new GetMedianOfStreamOfNumbers();
        median.addNumber(10);
        median.addNumber(15);
        System.out.println("Median is: "+ median.findMedian());
        median.addNumber(20);
        System.out.println("Median is: "+ median.findMedian());
        median.addNumber(25);
        median.addNumber(5);
        System.out.println("Median is: "+ median.findMedian());
    }
}
