package org.example.timbChalka;

import java.util.Random;

//public class Methods_1 {
//    public  int sum(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
//
//
//    public static void main(String[] args) {
//
//        int num1 = 5;
//        int num2 = 9;
//
//        Methods_1 addition = new Methods_1();
//        int result = addition.sum(num1, num2);
//        System.out.println("Sum is : " + result);
//    }
//}
public class Methods_1{

    public static int square(int a){

        return a*a;
    }
    public static int generateRandomNumber(){
        Random random = new Random();
        int RandomNumber = random.nextInt(100) +1;
        return RandomNumber;
    }

    public static void main(String[] args) {

        int number = generateRandomNumber();
        System.out.println("Generated random number"+number);


        System.out.println("Random number : "+Math.random());

        int result = square(5);
        System.out.println("Square of 5 is " + result);
    }
}
