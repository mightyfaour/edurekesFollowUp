package org.example.timbChalka.ARRAY;

public class Max_Mini_Value {
    public static void main(String[] args) {
        int []numbers = new int[10];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                System.out.println("Max: " + max);
            }
        }
    }

}
