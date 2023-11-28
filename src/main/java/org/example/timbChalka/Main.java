package org.example.timbChalka;

public class Main {
    public static void main(String[] args) {
        long miles = SpeedConvert.toMilesPerHour(1.5);
        System.out.println("Miles = "+ miles);

        SpeedConvert.printConversion(10.5);
    }
}
