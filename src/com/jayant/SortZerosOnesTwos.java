package com.jayant;

import java.util.Arrays;

public class SortZerosOnesTwos {
    int[] inputArray;
    SortZerosOnesTwos(){
        int[] arr={2,0,2,1,1,0};
        inputArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inputArray[i] = arr[i];
        }
    }
    SortZerosOnesTwos(int[] arr){
        inputArray=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inputArray[i] = arr[i];
        }
    }
    int[] bruteForceSolution(){
        int[] arr=new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr[i]= inputArray[i] ;
        }
        Arrays.sort(arr);
        return arr;
    }

    int[] betterForceSolution(){
        int[] arr=new int[inputArray.length];
        int zeros=0;
        int ones=0;
        int twoes=0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i]==0)zeros++;
            else if(inputArray[i]==1)ones++;
            else twoes++;
        }
        for (int i = 0; i < zeros; i++) {
            arr[i]=0;
        }
        for (int i = zeros; i < zeros+ones; i++) {
            arr[i]=1;
        }
        for (int i = zeros+ones; i < ones+zeros+twoes; i++) {
            arr[i]=2;
        }
        return arr;
    }

    int[] optimalForceSolution(){
        int[] arr=new int[inputArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputArray[i];
        }
        int low=0;
        int high=inputArray.length-1;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                low++;mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        return arr;
    }
}
