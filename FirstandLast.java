package com.DSAProblems;

public class FirstandLast {
    public static void main(String[] args) {
        int []arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
        occu(arr,10);
    }
    static void occu(int[] arr,int target){
        boolean visitFirst = false;
        boolean visitLast = false;
        for (int s = 0,e = arr.length-1;s<arr.length && e>0;s++,e--){
            if (arr[s] == target && !visitFirst){
                visitFirst = true;
                System.out.println("First accurrence is : "+s);

            }
            if (arr[e] == target && !visitLast){
                System.out.println("Last occurrence is "+e);
                visitLast = true;

            }
        }
    }
}
