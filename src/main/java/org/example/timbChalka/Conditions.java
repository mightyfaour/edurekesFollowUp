package org.example.timbChalka;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10");
//        int number = scanner.nextInt();
//
//        if (number < 0){
//            System.out.println("This number is negative");
//
//        }
//        System.out.println("Enter a number between 1 and 10");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a language");
        String language = scanner.nextLine();

        if (language == "Java"){
            System.out.println("You are using Java");
        }
        else if (language == "Python"){
            System.out.println("You are using Python");
        }
        else if (language == "C#"){
            System.out.println("You are using C#");

        }
        else if (language == "C++"){
            System.out.println("You are using C++");
        }
        else if (language == "Ruby"){
            System.out.println("You are using Ruby");
        }
        else {
            System.out.println("You are using " + language);
        }
    }
}
