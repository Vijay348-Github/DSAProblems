package com.DSAProblems;

import java.util.Arrays;

public class StringsInjava {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i <26; i++) {
            char ch = (char)('a'+i);
            s += ch + " ";
        }
        System.out.println(s);
        String a = "dependency";
        System.out.println(Arrays.toString(a.split("e")));
    }
}
