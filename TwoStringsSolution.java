package com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

class TwoStringsSolution{
    static String twoStrings(String s1, String s2) {
        // Use streams to convert to Set of Characters, only need to match one character to have equal substrings
        Set<Character> stringSet = s1.chars().mapToObj(elem -> (char) elem).collect(Collectors.toSet());
        // Traverse array, looking for character matches
        for(char ch: s2.toCharArray()){
            if (stringSet.contains(ch)){
                return "YES";
            }
        }
        // int index = 0;
        // Map<Integer, Character> stringMap = new HashMap<>(); 
        // for(char ch: s1.toCharArray()){
        //     stringMap.put(index, ch);
        //     index++;
        // }
        // for(char ch: s2.toCharArray()){
        //     if (stringMap.values().contains(ch)){
        //         return "Yes";
        //     }
        // }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("Alpha", "male"));
    }
}