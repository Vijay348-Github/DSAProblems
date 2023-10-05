package com.DSAProblems;

public class EvenDigitNumsinarray {
    public static void main(String[] args) {
        int [] arr = {12,1234,567,987654,23,45};
//        System.out.println(evenDigNums(arr));
        eveCount(arr);
    }
//    static int evenDigNums(int[] arr){
//        int digits = 0;
//        for (int row = 0; row < arr.length; row++) {
//           if(eve(arr[row])){
//               digits++;
//           }
//        }
//        return digits;
//    }
//
//    public static boolean eve(int i) {
//        int count = 0;
//        while(i!=0){
//            count++;
//            i = i/10;
//        }
//        if (count%2 == 0){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
    public static void eveCount(int[] arr){
        int digit = 0;
        for (int i = 0; i < arr.length; i++) {
            int co = 0;
            while (arr[i]!=0){
                co++;
                arr[i]/=10;
            }
            if (co%2 == 0){
                digit++;
            }
        }
        System.out.println("Elements with even digits in the array are : "+digit);

    }
}
