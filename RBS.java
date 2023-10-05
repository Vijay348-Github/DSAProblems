package com.DSAProblems;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr,3);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int pivot = findPivot(arr);
        if (pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (target >=arr[0]){
           return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarySearch (int[] arr,int target,int start,int end){
        while (start<=end) {
            int midIndex = start + (end - start) / 2;
            if (target > arr[midIndex]) {
                start = midIndex + 1;
            } else if (target < arr[midIndex]) {
                end = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
