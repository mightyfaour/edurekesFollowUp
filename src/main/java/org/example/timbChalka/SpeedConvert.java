package org.example.timbChalka;

public class SpeedConvert {
    public static long toMilesPerHour(double kilometerPerHour){
        if (kilometerPerHour < 0){
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }

    public static void printConversion (double kilometerPerHour){
        if (kilometerPerHour < 0){
            System.out.println("Invalid value");
        }else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/h "+ milesPerHour+"mi/h");
        }
    }
}
