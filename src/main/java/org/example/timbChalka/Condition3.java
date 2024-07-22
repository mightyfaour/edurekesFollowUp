package org.example.timbChalka;

import java.util.Scanner;

public class Condition3 {

        public static void main(String[] args) {

            // take input from users
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your marks: ");
            double marks = scanner.nextDouble();

            // ternary operator checks if
            // marks is greater than 40
            String result = (marks > 40) ? "pass" : "fail";

            System.out.println("You " + result + " the exam.");
            scanner.close();
        }

}
