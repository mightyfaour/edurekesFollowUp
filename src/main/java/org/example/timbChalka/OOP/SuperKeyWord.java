package org.example.timbChalka.OOP;

import com.sun.jdi.connect.Connector;

public class SuperKeyWord {
//    public
    public class Animal{
        protected  String name = "Animal";
        public void displayInfo(){
            System.out.println("I am animal");
        }
        Animal(String name){
            System.out.println("I am a werewolf");
        }
    }
//    public class Cat extends Animal{
//        public void displayInfo(){
//
//            String type = super.name;
//            super.displayInfo();
//            System.out.println("I am cat");
//            System.out.println("Cat is a type of  " + type);
//        }
//
//    }
    public class Dog extends Animal{
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("I am dog");
        }
        Dog(){
            super("Alpha ");
            System.out.println("I am dog in life");
        }
    }

    public void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.displayInfo();
        Dog dog1 = new Dog();
        dog1.displayInfo();
    }
}
