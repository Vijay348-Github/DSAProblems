package com.DSAProblems;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {43,56,2,78,90,4,1,23,53,79,12};
        insSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}
