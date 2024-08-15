package org.example.timbChalka.OOP.InheritanceCharllenge;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Chaange to "+ this.currentGear+" Gear");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("car.changeVelocity(); Velocity at "+ speed+ " Direction at "+ direction);
        move(speed, direction);
    }
}
