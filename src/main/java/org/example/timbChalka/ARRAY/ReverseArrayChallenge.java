package org.example.timbChalka.ARRAY;

import java.util.Arrays;

/*
created by Philip Nwodu for a learning purpose
*/
public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("array = "+ Arrays.toString(array));
        reverse(array);
        System.out.println("reversed array = "+Arrays.toString(array));

    }
    public static  void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLenght = array.length / 2;
        for (int i = 0; i < halfLenght; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            
        }
    }
}
