package com.DSAProblems;

public class BinarySearch1 {
    public static void main(String[] args) {
        int [] arr = {-78,-26,-2,5,9,12,32,43,56,95};
        int target = 56;
        int found = binarySearchnum(arr,target);
        System.out.println(found);
    }
    static int binarySearchnum(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int midIndex = start + (end-start)/2;
            if (target>arr[midIndex]){
                start = midIndex+1;
            } else if (target<arr[midIndex]) {
                end = midIndex-1;
            }
            else {
                return midIndex;
            }
        }
        return  -1;
    }
}
