package org.example.timbChalka;

import java.util.Scanner;

public class Addition {
//    Addition of two numbers
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // this is how you collect input from user
        System.out.print("Enter first integer: /n" );
        int first = input.nextInt();

        // this is how you collect second input from the user
        System.out.print("Enter second integer: %d%n");
        int second = input.nextInt();
        int result = first + second;

        System.out.println("Addition of " + first + " and " + second + " is " + result);
    }
    
}
