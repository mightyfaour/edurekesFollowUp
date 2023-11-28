package org.example;

public class Main {
    public void nonStaticTest(){
        System.out.println("Non Static Test!");
    }
    public static void staticTest(){
        System.out.println("Static Test!");
    }
    public static void main(String[] args) {
        Main mainObject = new Main();
        System.out.println("Hello world!");
        staticTest();

        mainObject.nonStaticTest();


    }
}