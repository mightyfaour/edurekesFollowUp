package org.example.timbChalka.OOP.POLIMORPHYSM.Challenge;

public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("Delux ", "Sausage & Beacon", 15.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drinks", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to the Delux Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to the Delux Burger");

    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to the Delux Burger");

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to the Delux Burger");

    }
}
