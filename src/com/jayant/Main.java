package com.jayant;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      //SetMatrix
        //BRUTE SOLUTION
//        SetMatrix setMatrixObject=new SetMatrix();
//        int[][] outputMatrixBrute=setMatrixObject.bruteSolution();
//        for (int i = 0; i < outputMatrixBrute.length; i++) {
//            System.out.println(Arrays.toString(outputMatrixBrute[i]));
//        }

        //BETTER SOLUTION
//        SetMatrix setMatrixObject=new SetMatrix();
//        int[][] outputMatrixBetter=setMatrixObject.betterSolution();
//        for (int i = 0; i < outputMatrixBetter.length; i++) {
//            System.out.println(Arrays.toString(outputMatrixBetter[i]));
//        }

        //OPTIMAL SOLUTION
//        SetMatrix setMatrixObject=new SetMatrix();
//        int[][] outputMatrixOptimal=setMatrixObject.betterSolution();
//        for (int i = 0; i < outputMatrixOptimal.length; i++) {
//            System.out.println(Arrays.toString(outputMatrixOptimal[i]));
//        }

    //  PASCAL TRIANGLE
//    PascalTriangle pascalTriangleObject=new PascalTriangle();
//    System.out.println(pascalTriangleObject.nCrFunction(3,2));
//    System.out.println(pascalTriangleObject.varIIGetRow(5));
//    System.out.println(pascalTriangleObject.varIIICompleteTriangle(10));


    //NEXT PERMUTATION
//        NextPermutation nextPermutation=new NextPermutation();
//        int[] outputArray=nextPermutation.optimalSoultion();
//        System.out.println(Arrays.toString(outputArray));

    //KADANE's ALGORITHM
//        KadaneAlgorithm kadaneAlgorithm=new KadaneAlgorithm();
//        System.out.println(kadaneAlgorithm.bruteSolution());
//        System.out.println(kadaneAlgorithm.optimalSolution());


    //Sort
        SortZerosOnesTwos obj= new SortZerosOnesTwos();
        System.out.println(Arrays.toString(obj.optimalForceSolution()));
    }
}
