package com.jayant;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrix {
    private int[][] inputMatrix;

    SetMatrix(){
        int[][] defaultMatrix={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        inputMatrix=defaultMatrix;
    }
    SetMatrix(int[][] arr){
        inputMatrix=arr;
    }
    public int[][] bruteSolution(){
        // 1. get all zeros
        // 2. mark all row and col ==0
        ArrayList<ArrayList<Integer>> getAllZeros=new ArrayList<>();
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if(inputMatrix[i][j]==0){
                    ArrayList<Integer> tempList=new ArrayList<>();
                    tempList.add(i);
                    tempList.add(j);
                    getAllZeros.add(new ArrayList<>(tempList));
                }
            }
        }

        for (int i = 0; i < getAllZeros.size(); i++) {
            int row=getAllZeros.get(i).get(0);
            int col=getAllZeros.get(i).get(1);

            for (int j = 0; j < inputMatrix[0].length; j++) {
                inputMatrix[row][j]=0;
            }
            for(int j=0;j<inputMatrix.length;j++){
                inputMatrix[j][col]=0;
            }
        }

        return inputMatrix;
    }

    public int[][] betterSolution(){
        //The space complexity is improved in this case
        boolean[] rowZeros=new boolean[inputMatrix.length];
        boolean[] colZeros=new boolean[inputMatrix[0].length];

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if(inputMatrix[i][j]==0){
                    rowZeros[i]=true;
                    colZeros[j]=true;
                }
            }
        }

        for (int i = 0; i < rowZeros.length; i++) {
            if(rowZeros[i]){
                for (int j = 0; j < inputMatrix[0].length; j++) {
                    inputMatrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < colZeros.length; i++) {
            if(colZeros[i]){
                for (int j = 0; j < inputMatrix.length; j++) {
                    inputMatrix[j][i]=0;
                }
            }
        }

        return inputMatrix;
    }
    
    public int[][] optimalSolution(){
        int initalMark=1;
        for (int i = 0; i < inputMatrix.length; i++) {
            if(inputMatrix[i][0]==0){
                initalMark=0;
                break;
            }
        }
        for (int i = 1; i < inputMatrix[0].length; i++) {
            if(inputMatrix[i][0]==0){
                inputMatrix[0][0]=0;
                break;
            }
        }
        for (int i = 1; i < inputMatrix.length; i++) {
            for (int j = 1; j < inputMatrix[0].length; j++) {
                if(inputMatrix[i][j]==0){
                    inputMatrix[i][0]=0;
                    inputMatrix[0][j]=0;
                }
            }
        }

        for (int i = 1; i <inputMatrix[0].length ; i++) {
            if(inputMatrix[0][i]==0){
                for (int j = 0; j < inputMatrix.length; j++) {
                    inputMatrix[j][i]=0;
                }
            }
        }

        for (int i = 1; i <inputMatrix.length ; i++) {
            if(inputMatrix[i][0]==0){
                for (int j = 0; j < inputMatrix[0].length; j++) {
                    inputMatrix[i][j]=0;
                }
            }
        }

        if(inputMatrix[0][0]==0){
            for (int i = 1; i < inputMatrix[0].length; i++) {
                inputMatrix[0][i]=0;
            }
        }
        if(initalMark==0){
            for (int i = 0; i < inputMatrix.length; i++) {
                inputMatrix[i][0]=0;
            }
        }
        return inputMatrix;
    }
}
