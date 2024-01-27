package com.jayant;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation {
    int[] inputArray;
    NextPermutation(){
        int[] input={3,2,1};
        inputArray=input;
    }
    NextPermutation(int[] input){
        inputArray=input;
    }

    protected void permutationRecursion(int[] arr,boolean[] visited,ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> output){
        if(ds.size()==arr.length){
            output.add(new ArrayList<>(ds));
            return ;
        }
        for (int j = 0; j < arr.length; j++) {
            if(!visited[j]){
                visited[j]=true;
                ds.add(arr[j]);
                permutationRecursion(arr,visited,ds,output);
                visited[j]=false;
                ds.remove(ds.size()-1);
            }
        }
        return ;
    }
    protected int search(ArrayList<ArrayList<Integer>> outputList) {
        int index = -1;

        for (int i = 0; i < outputList.size(); i++) {
            boolean flag = true;  // Initialize flag to true
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j] != outputList.get(i).get(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int[] bruteSolution(){
        ArrayList<ArrayList<Integer>> outputList=new ArrayList<>();
        int[] newInputArray=new int[inputArray.length];
        for (int i = 0; i < newInputArray.length; i++) {
            newInputArray[i]= inputArray[i];
        }
        Arrays.sort(newInputArray);
        permutationRecursion(newInputArray,new boolean[inputArray.length],new ArrayList<>(),outputList);
        int[] outputArray=new int[inputArray.length];
        int index=(search(outputList)+1)% outputList.size();
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i]=outputList.get(index).get(i);
        }
        return outputArray;
    }
    //There is only optimal solution for this
//    public int[] optimalSolution(){
//
//    }
}
