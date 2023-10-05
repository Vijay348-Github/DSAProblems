package com.DSAProblems;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] ar = {21,23,45,65,89};
        maxNum(ar,0,ar.length-1);
        reverse(ar);
    }
    public static void maxNum(int[] ar,int begin,int end){
        int max = ar[begin];
        for (int i = begin; i <= end ; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("Maximum number in the array is : "+max);
    }
    public static void swap(int[]ar,int start,int end){
        int temp = ar[start];
        ar[start] = ar[end];
        ar[end] = temp;
    }
    public static void reverse(int[] ar){
        int star = 0;
        int last = ar.length-1;
        while (star<last){
            swap(ar,star,last);
            star++;
            last--;
        }
        System.out.println(Arrays.toString(ar));
    }
}
