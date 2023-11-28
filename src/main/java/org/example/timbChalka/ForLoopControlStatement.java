package org.example.timbChalka;

public class ForLoopControlStatement {
    public static void main(String[] args) {
//        calculateInterest(10000, 2);
        System.out.println(calculateInterest(10000, 2));
        System.out.println(calculateInterest(10000, 3));
        System.out.println(calculateInterest(10000, 4));
        System.out.println(calculateInterest(10000, 5));
        System.out.println(calculateInterest(10000, 6));
        System.out.println(calculateInterest(10000, 7));
        System.out.println(calculateInterest(10000, 8));
//        calculateInterest(10000, 3);
//        calculateInterest(10000, 4);
//        calculateInterest(10000, 5);
//        calculateInterest(10000, 6);
//        calculateInterest(10000, 7);
//        calculateInterest(10000, 8);

        for (double i = 2; i <= 8; i++) {
            System.out.println("interest rate = "+ i+"%, "+ "calculated interest = "+String.format("%.2f",calculateInterest(10000, i)));
        }

        for (int i = 8; i >= 2 ; i--) {
            System.out.println("------interest rate = "+ i+"%, "+ "calculated interest = "+String.format("%.2f",calculateInterest(10000, i)));
        }


    }
    public  static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
