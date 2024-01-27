package com.jayant.SDE;

public class StockBuyandSell_I {
    int[] inputArray;
    StockBuyandSell_I(){
        int[] arr={7,1,5,3,6,4};
        inputArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inputArray[i]=arr[i];
        }
    }
    StockBuyandSell_I(int[] arr){
        inputArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inputArray[i]=arr[i];
        }
    }

    int bruteForceSolution(){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            int profit=0;
            for (int j = i+1; j < inputArray.length; j++) {
                profit=inputArray[j]-inputArray[i];
                max=Math.max(max,profit);
            }
        }
        return max;
    }

    int optimalSolution(){
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i < inputArray.length; i++) {
            buy=Math.min(buy,inputArray[i]);
            profit=Math.max(profit,inputArray[i]-buy);
        }
        return profit;
    }
}
