package org.example.Collections.List1.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Goat");
        animals.add(2,"Cow");


        System.out.println("Arraylist " + animals);
        int animal = animals.indexOf("Goat");
        System.out.println(animal);

//        ArrayList implementation
        List<String> list1 = new ArrayList<>();

//        LinkedList Implementation
        List<String> list2 = new LinkedList<>();

    }

}
