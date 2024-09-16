package org.example.Collections.List1.VECTOR;

import java.util.Iterator;
import java.util.Vector;

public class Vectorss {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();
        //Using the add() method
        mammals.add("Dog");
        mammals.add("Goat");
        mammals.add("Horse");

        System.out.println(mammals);
        //Using the index number
        mammals.add(2, "Lion");
        System.out.println(mammals);

        // Using the addAll() method
        Vector<String> animal = new Vector<>();
        animal.add("Crocodile");

        animal.addAll(mammals);
        mammals.addAll(animal);
        System.out.println(animal);
        System.out.println(mammals);
        String element2 = animal.get(2);
        System.out.println(element2);

        Iterator<String> iterators = mammals.iterator();
        System.out.print("Vector : ");
        while (iterators.hasNext()){
            System.out.print(iterators.next());
            System.out.print(", ");
        }
        String newMammal = mammals.remove(1);
        System.out.println("removed Mammal : "+newMammal);
        System.out.println("New mammal : "+ mammals);
        animal.clear();
        System.out.println(mammals);
        System.out.println(animal);
    }

}
