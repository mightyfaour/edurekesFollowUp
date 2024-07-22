package org.example.timbChalka;

public class Object_Classes {

    public static void main(String[] args) {
        lamp powerOn = new lamp();
        lamp powerOff = new lamp();

        powerOn.isOn();
        powerOff.isOff();
    }
}
class lamp{
    boolean isOn;

    void isOn(){
        isOn = true;
        System.out.println("lamp is on " + isOn);
    }
    void isOff(){
        isOn = false;
        System.out.println("lamp is off " + isOn);
    }
}

