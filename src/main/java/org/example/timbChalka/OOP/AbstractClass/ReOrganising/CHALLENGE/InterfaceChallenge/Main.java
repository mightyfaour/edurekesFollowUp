package org.example.timbChalka.OOP.AbstractClass.ReOrganising.CHALLENGE.InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player phil = new Player("Philip", 15, 20);
        System.out.println(phil.toString());
        savedObject(phil);

        System.out.println("--------------------------------");
        phil.setHitPoint(8);
        System.out.println(phil);
        phil.setWeapon("Magical Wond!");
        savedObject(phil);
        loadObject(phil);
        System.out.println(phil);

    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case  0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void savedObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving "+ objectToSave.write().get(i)+" to storage device ");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
    }
}

