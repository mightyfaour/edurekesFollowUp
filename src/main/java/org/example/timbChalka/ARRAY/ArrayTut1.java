package org.example.timbChalka.ARRAY;

public class ArrayTut1 {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
//        for (int i = 0; i <= 3; i++) {
//            int random = nums[3][4];
//            System.out.print(i+"  |");
//        }
//        System.out.println();


        System.out.println("first ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }

        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("_"+nums[i][j] + " _|");
            }
            System.out.println();
        }
        System.out.println("Second ");
        for (int num1[] : nums){
            for (int num2 : num1){
                System.out.print(num2 + " ");
            }
            System.out.println();
        }
    }
}
