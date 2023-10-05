package com.DSAProblems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "peek";
        String s2 = "keep";
        anagram(s1,s2);

    }
    public static void anagram(String s1,String s2){
        String st1 = s1.replaceAll("\\s","").toLowerCase();
        String st2 = s2.replaceAll("\\s","").toLowerCase();
        boolean check = false;
        if (st1.length()!=st2.length()){
            check = false;
        }
        else {
            char[] ar1 = st1.toCharArray();
            char[] ar2 = st2.toCharArray();
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            check = Arrays.equals(ar1,ar2);
        }
        if (check){
            System.out.println("Anagrams ");
        }
        else {
            System.out.println("Not anagrams");
        }
    }
}
