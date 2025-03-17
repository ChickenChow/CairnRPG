public class World {
    private String name;
    private int difficultyLevel = 1;

    public World() {
        this.name = "Unknown World";
        this.difficultyLevel = 1;
    }

    public String getInfo() {
        return "World: " + name + ", Difficulty: " + difficultyLevel;
    }
}
