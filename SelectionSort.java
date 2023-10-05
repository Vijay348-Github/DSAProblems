package com.DSAProblems;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {43,56,2,78,90,4,1,23,53,79,12};
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxValueIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    static int getMaxValueIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last ; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
