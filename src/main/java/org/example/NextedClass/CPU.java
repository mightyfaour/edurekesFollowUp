package org.example.NextedClass;

public class CPU {
    double price;

    class Processor{
        double score;
        String manufacturer;
        double getCache(){
            return 4.5;
        }
    }

    protected class RAM{
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}
