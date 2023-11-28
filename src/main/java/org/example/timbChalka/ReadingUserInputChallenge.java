package org.example.timbChalka;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while (true){
//            int arrangement = counter + 1;
//            System.out.println("Enter number #" + arrangement + ": ");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt){
//                int number = scanner.nextInt();
//                counter++;
//                sum+=number;
//                if (counter == 10){
//                    break;
//                }
//            }
//            else {
//                System.out.println("Invalid number");
//            }
//        another way to solve this without a brake statement
        while (counter < 10){
            int arrangement = counter + 1;
            System.out.println("Enter number #" + arrangement + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum+=number;
//                if (counter == 10){
//                    break;
//                }
            }
            else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = "+ sum);
        scanner.close();

    }
}
