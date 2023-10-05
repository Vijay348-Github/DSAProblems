package com.DSAProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prime(40)));
    }
    static int[] prime(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            int co = 0;
            for (int j = 1; j <=i; j++) {
                if (i%j == 0){
                    co++;
                }
            }
            if (co == 2){
                al.add(i);
            }
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
}
