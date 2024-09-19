package com.qProject.queue.InterviewProblems;
//Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will represent the colors as:
//red -> 0
//white -> 1
//blue -> 2
//
//Note: Using the library sort function is not allowed


import java.util.Arrays;

// Solution approach : 3 pointers
public class DutchFlagProblem {
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static int[] sortColors(int[] A) {
        int low = 0, mid = 0, high = A.length -1;
        while (mid <= high) {
            if(A[mid] == 0) { // found a red ball
                // swap with low pointer
                swap(A, low, mid);
                low++;
                mid++;
            } else if (A[mid] ==1) { // found white ball in mid
                mid++;

            } else if (A[mid] ==2) { // found blue ball
                swap(A, mid, high);
                high--;

            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {2, 0, 1, 2, 2, 1};
        sortColors(A);
        for (int i: A) {

            System.out.print(i + " ");
        }
    }
}
