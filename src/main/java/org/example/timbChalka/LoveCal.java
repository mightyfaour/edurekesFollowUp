package org.example.timbChalka;

import java.util.Random;
import java.util.Scanner;

public class LoveCal {
    // this is an App that Calculate the possible love_relation btween 2 individuals

    public static int generateRandomNumber(){
        Random random = new Random();
        int RandomNumber = random.nextInt(100) +1;
        return RandomNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Crush Name: ");
        String crushName = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Enter your Crush Age: ");
        int crushAge = scanner.nextInt();
        if (name.isEmpty() && crushName.isEmpty() || name.isEmpty() || crushName.isEmpty()){
            System.out.println("You have not entered all the information to determine the love level between you two!");
            System.out.println("0%");
            if (age >= 16 && crushAge >= 16){
                System.out.println("Aaaaaah! Stop the relationship immediately");
            }

        } else if (generateRandomNumber() <= 35) {
            System.out.println(generateRandomNumber()+"%");
            System.out.println("Break up immediately, and try another for better lock "+ generateRandomNumber()+"% is too low");
            if (age >= 16 && crushAge >= 16){
                System.out.println("Aaaaaah! Stop the relationship immediately");
            }

        } else if (generateRandomNumber() > 35 || generateRandomNumber()<= 50) {
            System.out.println(generateRandomNumber()+"%");
            System.out.println("You can choose to break up or put in a little push maybe the percentage will increase to a better lock");
            if (age >= 16 && crushAge >= 16){
                System.out.println("Aaaaaah! Stop the relationship immidiately");
            }

        } else if (generateRandomNumber() >= 51 || generateRandomNumber() <= 70 ) {
            System.out.println(generateRandomNumber()+"%, See You two love birds, work on it or you might fall from "+generateRandomNumber()+ "% and start building afresh again...");
            if (age >= 16 && crushAge >= 16){
                System.out.println("Aaaaaah! Stop the relationship immidiately");
            }

        }else if (generateRandomNumber() >= 70 || generateRandomNumber() <= 100) {
            System.out.println(generateRandomNumber()+"%");
            System.out.println("Make the most out of it and enjoy yourselves to the fullest");
            if (age >= 16 && crushAge >= 16){
                System.out.println("Aaaaaah! Stop the relationship immidiately");
            }

        }else System.out.println(name.toUpperCase() + " & " + crushName.toUpperCase() + "  should not have met at all");
    }
}

