package org.example.timbChalka.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

/*
created by Philip Nwodu for a learning purpose
*/
public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMinimum(returnedArray);
        System.out.println("array = "+Arrays.toString(returnedArray));

        System.out.println("min = "+ returnedMin);
    }
    private static int[] readIntegers(int count){

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;

        }
        return array;
    }

    private static int findMinimum(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min){
                min = value;
            }

        }
        return min;
    }
}
