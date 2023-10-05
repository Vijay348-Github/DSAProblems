package com.DSAProblems;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cycleSort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

}
