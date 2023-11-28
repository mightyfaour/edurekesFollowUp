package org.example;

public class Array_CLass {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5 };
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println("Length of the array is "+num.length);
        System.out.println("OR");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }


        int numArray [][] = {{2,3}, {4,5}, {6,7,7}};
        System.out.println(numArray.length);
        System.out.println(numArray[0].length);
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.print(numArray[i][j]+" ");
            }
            System.out.println();
        }
    }

}
