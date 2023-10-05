package com.DSAProblems;

public class FindNuminInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 100;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end] ){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        if (end >= arr.length){
            end = arr.length-1;
        }
        return binarySearchnum(arr,target,start,end);
    }


    static int binarySearchnum(int[] arr,int target,int start,int end){
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
