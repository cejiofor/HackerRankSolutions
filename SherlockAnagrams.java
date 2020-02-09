package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SherlockAnagrams {
    //First Solution - inefficient
    static int sherlockAndAnagrams(String s) {
        List<String> subStrList = new ArrayList<>();
        String subStr;
        int anagramCount = 0;
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                subStr = s.substring(i, j);
                subStrList.add(subStr);
            }
        }
        for(String str: subStrList){
            System.out.println(str);
        }

        return anagramCount;

    }

    static boolean isAnagram(String a, String b){
        StringBuilder aSB = new StringBuilder(a);
        StringBuilder bSB = new StringBuilder(b);
        int uniqueChars = 0;
        for (int i = 0; i<aSB.length(); i++){
            int charIndex = bSB.indexOf(""+aSB.charAt(i));
            if (charIndex != -1){

            }
        }

    }

    public static void main(String[] args) {
//        System.out.println(sherlockAndAnagrams("ifailuhkqq"));
        System.out.println(sherlockAndAnagrams("kkkk"));
    }
}
