package org.example.timbChalka;

public class positiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(-45);
    }
    public static void checkNumber(int number) {
        if (number > 0){
            System.out.println("Positive Number");
        }else if (number < 0){
            System.out.println("Negative Number");
        }
        System.out.println("Equals to 0");
    }
}
