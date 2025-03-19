package src;

public class GameCharacter {
    private String name;
    private double health;
    private double attackPower;
    private boolean isAlive;

    public GameCharacter(String name, double health, double attackPower, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    public String getInfo() {
        return "Character: " + name + ", Health: " + health + ", Attack Power: " + attackPower + ", Alive: " + isAlive;
    }
}
