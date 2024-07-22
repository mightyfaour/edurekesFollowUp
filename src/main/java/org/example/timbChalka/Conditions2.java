package org.example.timbChalka;

import java.util.Scanner;

public class Conditions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Registration Number: ");
        String registrationNumber = scanner.nextLine();
        System.out.println("Please Enter Your First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please Enter Your Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please Enter Your Age: ");
        int age = scanner.nextInt();
//        scanner.close();
//        Scanner scanner2 = new Scanner(System.in);

        scanner.close();

        String result = firstName + " , " + lastName + "%d%n, " + age + "%d%n and  %d%n" + registrationNumber;
        System.out.println(result + "%d%n you are welcome to Bintra international School");
    }
}
