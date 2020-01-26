import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class WhatFlavorsSolution{
    //Best Solution
    static void whatFlavors(int[] cost, int money){
        //Create map to hold cost vales
        Map<Integer, Integer> costMap = new HashMap<>();
        int currentCost, moneyMatch;
        for (int i=0; i<cost.length; i++){
            currentCost = cost[i];
            moneyMatch = money - currentCost;
            if (costMap.containsKey(currentCost){
                // if the current cost is in map, get value which is the index of money-currentCost
                // Print index of value in map with current index
                System.out.println(costMap.get(currentCost)+ " "+ (i+1));
            }
            else{
                // Put the amount needed to match the current cost in array, with index of current value 
                costMap.put(moneyMatch, i+1);
            }
        }
    }

    //Timeout Error
    static void whatFlavorsOneList(int[] cost, int money) {
        int itemOne = 0;
        int itemTwo = 0;
        int moneyMatch = 0;
        List<Integer> costList = new ArrayList<>();
        costList = Arrays.stream(cost).boxed().collect(Collectors.toList());
        for (int i = 0; i<costList.size(); i++){
            int currentCost = costList.get(i);
            moneyMatch = money - currentCost;
            costList.set(i, -1);
            if (costList.contains(moneyMatch) && costList.indexOf(moneyMatch) != i){
                itemOne = i;
                itemTwo = costList.indexOf(moneyMatch);
                System.out.println((itemOne+1)+" "+(itemTwo+1));
                return;
            }
            costList.set(i, currentCost);
        }
    }

    // Duplicate costs don't work, map replaces
    static void whatFlavorsMap(int[] cost, int money) {
        int moneyMatch = 0;
        List<Integer> costList = new ArrayList<>();
        Map<Integer, Integer> costMap = new ConcurrentHashMap<>();
        for (int i = 0; i<cost.length; i++){
            costMap.put(cost[i], i+1);
        }
        
        int val;
        // for (Integer val: costMap.values()){
        for (int i = 0; i<costMap.size(); i++){
            val = costMap.get(i);
            moneyMatch = money - val;
            if(costMap.keySet().contains(moneyMatch)){
                int matchIndex = costMap.get(moneyMatch);
                System.out.println(i+1+" "+(matchIndex));
                return;
            }
            // costMap.put(val, temp);
        }
    }

    // Failed three test cases
    static void whatFlavorsFour(int[] cost, int money){
        // Sort the array to perform binary search
        int arrLength = cost.length;
        int moneyMatch, matchIndex;//, currentCost;
        int tempIndex = -1; 
        Map<Integer, Integer> costMap = new HashMap<>();
        for (int i = 0; i<cost.length; i++){
            if (costMap.containsKey(cost[i])){
                tempIndex = costMap.get(cost[i]);
            }
            costMap.put(cost[i], i+1);
        }

        int[] costCopy = cost.clone();
        Arrays.sort(costCopy);
        for(int currentCost: cost){
        // for (int i = 0; i<arrLength; i++){
            // currentCost = cost[i];
            moneyMatch = money - currentCost;
            matchIndex = Arrays.binarySearch(costCopy, 0, arrLength, moneyMatch);
            if (moneyMatch == money/2 && money%2 == 0){
                if (costMap.get(moneyMatch) != tempIndex && tempIndex > -1){
                    System.out.println((tempIndex)+" "+(costMap.get(moneyMatch)));
                    return;
                }
            }
            else if (matchIndex > -1){
                System.out.println(costMap.get(currentCost)+" "+costMap.get(moneyMatch));
                return;
            }
        }
    }
    public static void main(String[] args) {
        whatFlavors(new int[]{1,4,5,3,2},4);
        whatFlavors(new int[]{2,2,5,3,4},4);
        whatFlavors(new int[]{4,3,2,5,7},8);
        whatFlavors(new int[]{7,2,5,4,11},12);
        whatFlavors(new int[]{70,100},170);
    }
}