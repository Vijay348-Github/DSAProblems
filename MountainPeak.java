package com.DSAProblems;

public class MountainPeak {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,9,12,18,12,6,3,1,0};
        int a = mountainPeak(arr);
        System.out.println(a);
    }
    static int mountainPeak(int[] arr ){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;

    }
}
