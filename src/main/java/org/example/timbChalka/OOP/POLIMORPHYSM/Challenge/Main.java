package org.example.timbChalka.OOP.POLIMORPHYSM.Challenge;


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

    public String StartEngine(){
        return "Car -> Start Engine()";
    }
    public String accelerate(){
        return "Car -> Accelerate()";

    }
    public String brake(){
        return "Car -> brake()";
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

class Mitsubishi extends Car {
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String StartEngine() {
        return "Mitsubishi -> Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> Accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> Brake()";

    }
}

class Ford extends Car {
    public Ford(String name, int cylinders) {

        super(name, cylinders);
    }

    @Override
    public String StartEngine() {
        return "Ford -> Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> Accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> Brake()";

    }
}

class Holden extends Car {
    public Holden(String name, int cylinders) {

        super(name, cylinders);
    }

    @Override
    public String StartEngine() {
        return "Holden -> Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> Accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> Brake()";

    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        System.out.println(car.StartEngine());
        System.out.println(car.accelerate());
        System.out.println(car.accelerate());

        System.out.println("------------------------------------------------------------------");

        Ford ford = new Ford("Ford falcon",6);
        System.out.println(ford.StartEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.accelerate());

        System.out.println("------------------------------------------------------------------");

        Mitsubishi mitsubishi = new Mitsubishi("Outlander VRW 4WD",6);
        System.out.println(mitsubishi.StartEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.accelerate());


        System.out.println("------------------------------------------------------------------");

        Holden holden = new Holden("Holden Commodore",6);
        System.out.println(holden.StartEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.accelerate());

    }
}
