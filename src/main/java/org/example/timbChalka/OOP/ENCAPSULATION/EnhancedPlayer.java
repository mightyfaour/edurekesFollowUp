package org.example.timbChalka.OOP.ENCAPSULATION;

public class EnhancedPlayer {
    private String name;
    private int hitpoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100){
            this.hitpoints = health;

        }
        this.weapon = weapon;
    }



    public void loseHealt(int damage){
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0){
            System.out.println("Player knocked out");
//            reduce number of lives remaining for thge player
        }

    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitpoints;
    }

    public String getWeapon() {
        return weapon;
    }
}
