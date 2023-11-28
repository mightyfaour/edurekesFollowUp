package org.example.timbChalka.POLIMORPHYSM.Challenge;

public class Starter {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic ", "Sausage ",5.72,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomatoes",1.23);
        System.out.println("Total burger price is "+ hamburger.itemizeHamburger());
        System.out.println("----_____________---------___________------______-----------____--------____-------___-------___---");


        HealthyBurger healthyBurger = new HealthyBurger("Beacon", 5.67);
        healthyBurger.addHealthAddition1("egg", 12.34);
        healthyBurger.addHealthAddition2("Latuce", 2.91);
        System.out.println("Total healthy burger price is : "+ healthyBurger.itemizeHamburger());

        System.out.println("----_____________---------___________------______-----------____--------____-------___-------___---");

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.itemizeHamburger();
    }
}
