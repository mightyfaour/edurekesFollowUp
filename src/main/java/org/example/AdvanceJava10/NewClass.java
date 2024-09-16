package org.example.AdvanceJava10;
record Alien(int name, String color) { }
public class NewClass {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "blue");

        System.out.println(a1.name());
    }
}
