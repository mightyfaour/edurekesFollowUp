package org.example.timbChalka.OOP;

public class Dog extends Animal{

    private  int eye;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }

    public Dog(String name, int brain, int body, int size, int weight, int eye, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eye = eye;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}
