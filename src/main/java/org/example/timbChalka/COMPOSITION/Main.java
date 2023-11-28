package org.example.timbChalka.COMPOSITION;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B","DELL", "240", dimensions);

//        Resolution resolution = new Resolution(2540, 1440);

//        Monitor theMonitor = new Monitor("27inch beast", "Acer",27, resolution);
//        OR this is done to declare variables on the fly

        Monitor theMonitor = new Monitor("27inch beast", "Acer",27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "V2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500,1200, "Red");
//        thePC.getMotherboard().loadProgram("linux 5.0 pig");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
}
