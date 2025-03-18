package src;

import java.util.Random;

public class Character {
    private String name;
    private double health;
    private double attackPower;
    private boolean isAlive;

    public Character(String name, double health, double attackPower, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    public boolean runAway() {
        Random rand = new Random ();
        return rand.nextDouble() < 0.5; //50% chance to escape
    }

    public String getInfo() {
        return "Character: " + name +
                ", Health: " + health +
                ", Attack: " + attackPower +
                ", Alive: " + isAlive;
    }
}
