package com.jayant;

import java.util.ArrayList;

public class KadaneAlgorithm {
    int[] inputArray;

    KadaneAlgorithm(){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        this.inputArray=arr;
    }
    KadaneAlgorithm(int[] arr){
        this.inputArray=arr;
    }

    //BRUTEFORCE SOLUTION
    // 1. Using Recursion find the subarray and find maximum
    int bruteSolution(){
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < inputArray.length; i++) {
//            for (int j = i; j < inputArray.length ; j++) {
//                int sum=0;
//                for (int k = i; k <=j ; k++) {
//                    sum+=inputArray[k];
//                }
//                max=Math.max(max,sum);
//            }
//        }
//        return max;
        return recursionForBrute(inputArray,0);
    }

    private int recursionForBrute(int[] inputArray, int i) {
        if(i>= inputArray.length)return 0;
        int max=Integer.MIN_VALUE;
        for (int j = i; j < inputArray.length; j++) {
            int pick=inputArray[j]+recursionForBrute(inputArray,j+1);
            int notPick=recursionForBrute(inputArray,j+1);

            max = Math.max(notPick, pick);
        }
        return max;
    }

    int betterSolution(){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            int sum=0;
            for (int j = i; j < inputArray.length ; j++) {
                sum+=inputArray[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    int optimalSolution(){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            sum+=inputArray[i];
            if(max<sum)max=sum;
            if(sum<0)sum=0;
        }
        return max;
    }
}
