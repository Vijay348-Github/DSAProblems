package com.DSAProblems;

import java.util.Arrays;

public class IndexOfFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,9,10};
        int[] asa = search(arr,7);
        System.out.println(Arrays.toString(asa));

    }
    static int[] search(int[] arr,int target){
        int[] ans = {-1,-1};        // if not found
        ans[0] = searchIndex(arr,target,true);      // for finding the first index
        ans[1] = searchIndex(arr,target,false);     // for finding the last index

        return ans;
    }
    static int searchIndex(int[] arr,int target,boolean findStart){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int midIndex = start + (end - start) / 2;
            if (target > arr[midIndex]) {
                start = midIndex + 1;
            } else if (target < arr[midIndex]) {
                end = midIndex - 1;
            } else {
                ans = midIndex;
                if (findStart) {
                    end = midIndex - 1;
                } else {
                    start = midIndex + 1; ;
                }
            }
        }
        return ans;
    }
}
