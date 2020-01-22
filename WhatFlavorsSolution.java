public class WhatFlavorsSolution{
    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        int itemOne = 0;
        int itemTwo = 0;
        int moneyMatch = 0;
        for (int num: cost){
            moneyMatch = money - num;
            if (costList.contains(moneyMatch)){
                itemOne = costList.indexOf(num);
                itemTwo = costList.indexOf(moneyMatch);
            }
        }
        System.out.println((itemOne+1)+" "+(itemTwo+1));

    }
    public static void main(String[] args) {
        whatFlavors(new int[]{1,4,5,3,2},4);   
    }
}