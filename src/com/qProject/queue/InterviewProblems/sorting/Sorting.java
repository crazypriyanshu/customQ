package com.qProject.queue.InterviewProblems.sorting;

public class Sorting {
    // time complexity = O(n^2)
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            for (int j =0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // now swap the min index
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }



    }

    public static void merge(int[] arr, int left, int middle, int right){
        int n1 = middle - left +1;
        int n2 = right -middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, middle+1, rightArray, 0, n2);

        int i =0, j = 0;
        int k = left;
        while (i < n1 && j < n2){
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else{
                arr[k] = rightArray[i];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int middle = (left + right)/2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle+1, right);


        }


    }

    public static void main(String[] args) {
        int[] arr = {5, 13, 2, 10};
        insertionSort(arr);
        for (int elem: arr){
            System.out.println(elem);
        }
    }
}
