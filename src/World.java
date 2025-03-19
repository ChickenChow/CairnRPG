package src;

public class World {
    protected String name;
    protected int difficultyLevel = 1;
    protected String climate;
    protected String size;
    //Changed fields to protected again, as this allows direct access for other classes.

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
