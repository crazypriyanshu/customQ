package com.qProject.queue.InterviewProblems.arrays.twoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MostWater {

    public static int maxArea(int[] arr){
        int max_area = 0;
        int left = 0, right = arr.length-1;
        while(left < right){
            int width = right - left;
            int curr_Height = Math.min(arr[left], arr[right]);
            max_area = Math.max(max_area, (width*curr_Height));
            if(arr[left] < arr[right]){
                left++;
            } else{
                right--;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] arr =  {7, 15, 11, 12, 4};
        for (int i=0; i< arr.length; i++ ){
            System.out.println(arr[i]);
        }
        int max_water = maxArea(arr);
        System.out.println("max water "+ max_water);

    }
}
