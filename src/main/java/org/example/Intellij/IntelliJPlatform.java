package org.example.Intellij;

public class IntelliJPlatform {
    public static void main(String[] args) {
        // Simulating different environments
        Computer laptop = new Laptop();
        laptop.code();

        Computer desktop = new Desktop();
        desktop.code();

        // Future support for Tablet
        Computer tablet = new Tablet();
        tablet.code();
    }
}