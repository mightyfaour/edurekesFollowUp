package org.example.timbChalka.COMPOSITION;

public class PC {
    private  Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
//        fancy graphics goes here
//        getMonitor().drawPixelAt(1500, 50, "green");
        monitor.drawPixelAt(1500, 50, "green");
    }

    private Case getTheCase() {
        return theCase;
    }

    private void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
