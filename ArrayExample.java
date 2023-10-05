package com.DSAProblems;

import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {
//       int [] nums1 ={1,2};
//       int nums2[]  = {3,4};
//        System.out.println((findMedianSortedArrays(nums1,nums2)));
//        int [] a = {1,8,6,2,5,4,8,3,7};
//        int[] a1 = {1,1};
//        System.out.println(findMax(a1));
//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
////        int[] ar1 = {1,1,2};
//        System.out.println(Arrays.toString(findUniqCount(arr)));
        int[] a8 = {8,7,3,9,2};
        System.out.println(peakEle(a8));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[nums1.length + i] = nums2[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
       // return arr;
        double median = 0;
        int len = arr.length;
        int mid = len/2;
        if (len%2 == 0){
            median = (double) (arr[mid]+arr[mid-1])/2;
        }
        else if (len%2 == 1){
            median = arr[mid];
        }
        return median;
    }
    public static int findMax(int[] height) {
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] > height[j]) {
                    int temp = height[j];
                    height[j] = height[i];
                    height[i] = temp;
                }
            }
        }
        int max = 0;
        int max1 = height[height.length-1];
        int max2 = 0;
        if (height.length>=3){
            for (int j = height.length-1 ;j >0; j--) {
                if (height[j]!=height[j-1]){
                    max2 = height[j-1];
                    break;
                }
            }
        }
        else if (height.length <=2){
            max2 = height[height.length-1];
        }
        return max2*max2;
    }

    static int[] findUniqCount(int[] nums){
        int cou = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] == 0){
                cou = 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    nums[j] = 0;
                }
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                cou++;
                a.add(i,nums[i]);
            }
        }
        nums  = new int[a.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a.get(i);
        }
        return nums;
    }



     static int peakEle(int[] nums){
        int max = nums[0];
         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] > nums[j]) {
                     max = i;
                 }
             }
         }
         return max;
     }
}

