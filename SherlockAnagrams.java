package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SherlockAnagrams {
    //First Solution - inefficient, failed due to time out
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
        for (int i=0; i<subStrList.size(); i++){
            for (int j=i+1; j<subStrList.size(); j++){
                if (isAnagram(subStrList.get(i), subStrList.get(j))){
                    anagramCount++;
                }
            }
        }
        return anagramCount;
    }

    static boolean isAnagram(String a, String b){
        StringBuilder aSB = new StringBuilder(a);
        StringBuilder bSB = new StringBuilder(b);
        int strAChars = aSB.length();
        for (int i = 0; i<aSB.length(); i++) {
            int charIndex = bSB.indexOf(""+aSB.charAt(i));
            if (charIndex != -1){
                bSB.deleteCharAt(charIndex);
                strAChars--;
            }
        }
        return (bSB.length() == 0 && strAChars == 0);
    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("ifailuhkqq"));
        System.out.println(sherlockAndAnagrams("kkkk"));
        System.out.println(sherlockAndAnagrams("cdcd"));
    }
}
