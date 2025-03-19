package src;

public class Item {
    private String name;
    private int healingPower;

    public Item(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    //Changed "getInfo" to "info" as it is used like this in other class examples.
    public String info() {
        return "Item: " + name +
                ", Healing Power: " + healingPower;
    }
}
