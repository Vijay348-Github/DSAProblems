package com.DSAProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 21;
        arr[3] = 16;
      /*  for (int i = 0;i< arr.length;i++){
            int a = arr[i];
        }*/
        System.out.println(Arrays.toString(arr));
      /*  int []ar1 = new int[4];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = s.nextInt();

        }
        for (int a : ar1) {
            System.out.print(a+"  ");
        }*/
//        int [][] ar2 = new int[3][3];
//        for (int row = 0; row < ar2.length ; row++) {
//            for (int col = 0; col < ar2[row].length; col++) {
//                ar2[row][col] = s.nextInt();
//            }
//        }
//        for (int i = 0; i < ar2.length; i++) {
//            System.out.println(Arrays.toString(ar2[i]));
//        }
//        for (int[] b :ar2) {
//            System.out.println(Arrays.toString(b));
//        }
        int[] ar3 = {21,34,45,23,12,66,98,99,120};
        int large = 0;
        int small = 0;
        for (int i = 0; i < ar3.length; i++) {
            if (ar3[i]>large){
                large = ar3[i];
            }
        }
        for (int i = 0; i < ar3.length ; i++) {
            if(ar3[i]<large){
                small = ar3[i];
            }
        }
        System.out.println("Max value in ar3 is "+ large);
        System.out.println("Min value in ar3 is "+small);


    }
}
