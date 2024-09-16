package org.example.Collections.List1.ArrayList.SortedMethod;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(-33);

        System.out.println("Unsorted Array :"+numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Sorted Array :"+numbers);

    }
}
