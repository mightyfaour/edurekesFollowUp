package org.example.timbChalka.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTut {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortInteger(myIntegers);
        printArray(sorted);

    }
    public  static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+ capacity+ " integer value:\r");
        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+ i + " content "+array[i]);
        }
    }

    public static int[] sortInteger(int[]array){
        //copying or taking the content of an array and storing it in another array one by one-----------------------
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        //-------------------------------OR--------------------------
//        int[] sortArray = Arrays.copyOf(array,array.length);
        // this  is a sorting method -------------------------------------
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
