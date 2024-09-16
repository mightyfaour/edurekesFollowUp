package org.example.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class ToCreateASet {
    public static void main(String[] args) {
        HashSet<String> alphabet = new HashSet<>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        System.out.println(alphabet);

        ArrayList<String> alphabets = new ArrayList<>();
         alphabets.addAll(alphabet);
         alphabets.addAll(alphabets);
         alphabets.add(2, "Z");
         alphabets.set(2, "YYY");
        System.out.println(alphabets);
    }
}
