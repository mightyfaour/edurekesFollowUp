package org.example.timbChalka.COMPOSITION;

//Their relationship is call "Is A" relationship and that is INHERITANCE
public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
