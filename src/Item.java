package src;

public class Item {
    private String name;
    private int healingPower;

    public Item(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public String getInfo() {
        return "Item: " + name +
                ", Healing Power: " + healingPower;
    }
}
