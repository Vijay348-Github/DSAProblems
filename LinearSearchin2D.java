package com.DSAProblems;

public class LinearSearchin2D {
    public static void main(String[] args) {
        int[][] ar1 = {
                {12,13,43},
                {76,32,13,98},
                {65,86,22,56,89}
        };
        maxNum(ar1);
        searchNum(ar1,86);
    }
    static void maxNum(int [][] ar1){
        int max = ar1[0][1];
        for (int row = 0; row < ar1.length; row++) {
            for (int col = 0; col < ar1[row].length; col++) {
                if (ar1[row][col]>max){
                    max = ar1[row][col];
                }
            }
        }
        System.out.println("Maximium number is : "+max);
    }
    static void searchNum(int[][] ar1,int target){
        if (ar1.length == 0){
            System.out.println("no elements in array");
        }
        for (int row = 0; row < ar1.length; row++) {
            for (int col = 0; col < ar1[row].length; col++) {
                int element = ar1[row][col];
                if (element == target){
                    System.out.println("element is found at, row : "+row+"  column : "+col);
                }

            }
        }

    }
}
