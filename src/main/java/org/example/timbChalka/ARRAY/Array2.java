package org.example.timbChalka.ARRAY;


import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        System.out.println("This is a Test program to check if your crush is ment for you");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String Myname = input.nextLine();

        System.out.println("What is your crush name? /r " );
        Scanner input2 = new Scanner(System.in);
        String CrushName = input2.nextLine();


        System.out.println("My name is " + Myname + " and my crush name is " + CrushName);
    }
}
