package src;

public class GameCharacter {
    protected String name;
    protected double health;
    protected double attackPower;
    protected boolean isAlive;
    //This makes it so that each of the subclasses, hero, enemy, and boss, can have direct access

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
