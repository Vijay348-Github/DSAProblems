package com.DSAProblems;

import static com.DSAProblems.DuplicatesUsingCycleSort.swap;

public class MissingPositiveUsingCycle {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(cycleSort(arr));
    }
    static int cycleSort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);   // swap method imported
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;

    }

}
