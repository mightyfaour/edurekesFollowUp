package org.example.timbChalka.ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
        public static void main(String[] args) {

            boolean quit = false;
            int choice = 0;
            printInstruction();
            while (!quit){
                System.out.println("Enter your choice ->> ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 0:
                        printInstruction();
                        break;
                    case 1:
                        groceryList.printGroceryList();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5:
                        searchForItem();
                        break;
                    case 6:
                        processArrayList();
                        break;
                    case 7:
                        quit = true;
                        break;
                }
            }
    }

    public static  void printInstruction(){
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove the item from the list.");
        System.out.println("\t 5 - To search for an item from the list");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current Item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Enter Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.print("Found "+ searchItem + " i n our grocery list");
        } else {
            System.out.println(searchItem + " is not in our shopping list");
        }
    }
//A method to copy an array list to anothe array list
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

//        OR
//        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());
//        OR to copy from Arraylist to a normal array

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
