package com.DSAProblems;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr ,int target){
        int peek = mountainPeak(arr);
        int firsttry = binarySearchnum(arr,target,0,peek);
        if (firsttry!=-1){
            return firsttry;
        }
        return binarySearchnum(arr,target,peek+1, arr.length-1);

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
    static int binarySearchnum(int[] arr,int target,int start,int end){
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            int midIndex = start + (end-start)/2;
            if (arr[midIndex]==target){
                return midIndex;
            }
            if (isAsc){
                if (target>arr[midIndex]){
                    start = midIndex+1;
                } else if (target<arr[midIndex]) {
                    end = midIndex-1;
                }
            }
            else {
                if (target>arr[midIndex]){
                    end = midIndex-1;
                }
                else {
                    start = midIndex + 1;
                }
            }
        }
        return  -1;
    }
}
