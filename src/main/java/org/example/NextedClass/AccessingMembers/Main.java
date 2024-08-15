package org.example.NextedClass.AccessingMembers;

public class Main {
    public static void main(String[] args) {
        Car cars1 = new Car("Mazda", "8WD");

        System.out.println("create an object of inner class using the outer class ______");

        Car.Engine engine123 = cars1.new Engine();

        engine123.setEngineType();
        System.out.println("Engine Type for 8WD = " + engine123);

        System.out.println();
        Car car2 = new Car("Crysler", "4WD");

        Car.Engine engine456 = car2.new Engine();

        engine456.setEngineType();
        System.out.println("Engine Type for 4WD = " + engine456);


    }
}
