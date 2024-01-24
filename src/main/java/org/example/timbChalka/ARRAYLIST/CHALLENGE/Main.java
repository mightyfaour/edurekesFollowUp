package org.example.timbChalka.ARRAYLIST.CHALLENGE;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("08186082057");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printAction();
        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShoting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }

    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNo = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNo);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = "+name+" phone number = "+phoneNo);
        }
        else {
            System.out.println("Cannot add, "+name+" already onfile.");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateCOntact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        }
        else {
        System.out.println("Error updating record");}
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Unable to delete contact");
        }
    }
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+"\n Phone number is "+existingContactRecord.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Phone is staring ...");
    }

    private static void printAction(){
        System.out.println("\n Available action: \n Press");
        System.out.println("0 - To shutdown \n" +
                            "1 - T0 print contacts \n"+
                            "2 - To add a new contact \n"+
                            "3 - To update existing contact \n"+
                            "4 - To remove an existing contact \n"+
                            "5 - To query if any existing contact exist \n"+
                            "6 - To print a list available actions.\n");
        System.out.println("Choose your action:");
    }

}