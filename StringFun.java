package com.DSAProblems;

public class StringFun {
    public static void main(String[] args) {
        String s = "aaabccdee";
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for (int j = i+1;j< ch.length;j++){
                if (ch[i] == ch[j]){
                    count++;
                    ch[j] = '0';
                }
            }
            if (count == 1 && ch[i] != '0'){
                System.out.println(ch[i]);
            }
        }
    }
}
