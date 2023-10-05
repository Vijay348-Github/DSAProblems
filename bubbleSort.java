package com.DSAProblems;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {43,56,2,78,90,4,1,23,53,79,12};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                }
            }
        }
    }
}
