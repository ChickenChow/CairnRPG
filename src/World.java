package src;

public class World {
    private String name;
    private int difficultyLevel = 1;
    private String climate;
    private String size;

    public World() {
        this.name = "NPC Land";
        this.difficultyLevel = 1;
        this.climate = "Temperate";
        this.size = "Medium";
    }

    public String getInfo() {
        return "World: " + name +
                ", Difficulty: " + difficultyLevel +
                ", Climate: " + climate +
                ", Size: " + size;
    }
}
