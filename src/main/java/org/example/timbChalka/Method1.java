package org.example.timbChalka;

public class Method1 {
    public class Lamp{
        boolean isOn;

        void turnOn(){
            this.isOn = true;
            System.out.println("Is lamp on? "+ isOn);
        }
        void turnOff(){
            this.isOn = false;
            System.out.println("Is lamp on? "+ isOn);
        }
    }
    public void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        led.turnOff();
        halogen.turnOn();
        led.turnOff();

    }
}
