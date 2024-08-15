package org.example.timbChalka.OOP.POLIMORPHYSM;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void StartEngine(){
        System.out.println("Engine starting");
    }
    public void accelerate(int speed){
        System.out.println("Increase speed to accelerate");

    }
    public void brake(int speed){
        System.out.println("reduce speed before brake");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

