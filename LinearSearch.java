package com.DSAProblems;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,43,24,65,87,96,120,123};
        System.out.println(findNum(arr,43));

        String str = "Hello india";
        char targ = 'q';
        System.out.println(stringCharSearch(str,targ));
        System.out.println(Arrays.toString(str.toCharArray()));


        minNum(arr);



    }
    static int findNum(int[] arr,int target){
        if (arr.length ==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele==target){
                return i;
            }
        }
        return -1;
    }

    // seraching for a character ina given string
    static boolean stringCharSearch(String str,char target2){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==target2){
                return true;
            }
        }
        return false;
    }


    static void minNum(int [] arr){
//        if (arr.length == 0){
//            System.out.println(-1);
//        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
