package org.example.timbChalka.COMPOSITION;

public class Lamp {
    private String style;
    private boolean battery;
    private int globeRating;

    public Lamp(String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public void turnOn(){
        System.out.println("Lamp --> Turning on");
    }
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }

    public void setGlobeRating(int globeRating) {
        this.globeRating = globeRating;
    }
}
