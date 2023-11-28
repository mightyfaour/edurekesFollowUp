package org.example.timbChalka;

import java.util.Scanner;

public class Lecture26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name ");
            String name = scanner.nextLine();
//logic behind the scene
            int currentYear = 2023;
            int age = currentYear - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println(name + " Your age is " + age + " years old.");
            }else {
                System.out.println(name + " you entered an invalide year of birth");
            }
        }
        scanner.close();
    }
}
