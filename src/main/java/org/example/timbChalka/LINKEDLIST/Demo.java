package org.example.timbChalka.LINKEDLIST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
created by Philip Nwodu for a learning purpose ONLY
*/
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInorder(placesToVisit, "Lagos");
        addInorder(placesToVisit, "Delta");
        addInorder(placesToVisit, "PortHarcourt");
        addInorder(placesToVisit, "Abuja");
        addInorder(placesToVisit, "Abia");
        addInorder(placesToVisit, "Adamawa");
        addInorder(placesToVisit, "Akwa-Ibom");

        printList(placesToVisit);
        addInorder(placesToVisit, "Lagos");
        addInorder(placesToVisit, "Yenogwa");
        printList(placesToVisit);
        visit(placesToVisit);

        
//        placesToVisit.add("Lagos");
//        placesToVisit.add("Delta");
//        placesToVisit.add("PortHacourt");
//        placesToVisit.add("Abuja");
//        placesToVisit.add("Abia");
//        placesToVisit.add("Adamawa");
//        placesToVisit.add("Akwai-ibom");
//
//        printList(placesToVisit);
//        placesToVisit.add(1,"Ogun");
//        printList(placesToVisit);
//        placesToVisit.remove(7);
//        printList(placesToVisit);
//        placesToVisit.indexOf(placesToVisit);
//        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("================================");
    }
    private static boolean addInorder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
//                equal do not add
                System.out.println(newCity+ " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new city should appear before this one
                //
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quite = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }

        while (!quite){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over!");
                    quite = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else {
                        System.out.println("reach the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }


    private static void printMenu(){
        System.out.println("Available actions: \n Press ");
        System.out.println("0 - to quite\n " +
                            "1 - go to next city\n " +
                            "2 - go to previous city\n" +
                            "3 - print menu option ");
    }
}
