package com.jayant;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangle {
    PascalTriangle(){

    }
    public int nCrFunction(int n,int r){
        int result=1;
        n--;r--;
        for (int i = 1; i <= r; i++) {
            result*=n--;
            result/=i;
        }
        return result;
    }

    public int varIGetElement(int n,int r){
        return nCrFunction(n,r);
    }

    public ArrayList<Integer> varIIGetRow(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(nCrFunction(n,i));
        }
        return list;
    }

    public ArrayList<ArrayList<Integer>> varIIICompleteTriangle(int n){
        ArrayList<ArrayList<Integer>> outputList=new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> list=new ArrayList<>();
            for (int j = 1; j <=i; j++) {
                list.add(nCrFunction(i,j));
            }
            outputList.add(new ArrayList<>(list));
        }
        return outputList;
    }
}
