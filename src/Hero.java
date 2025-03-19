public class Hero extends Character {
    private int level;
    private int experience;
    private double money;
    private ArrayList<Item> inventory;

    public Hero(double health, double attackPower, boolean isAlive) {
        super("HeroName", health, attackPower, isAlive);
        this.level = 1;
        this.experience = 0;
        this.money = 0.0;
        this.inventory = new ArrayList<>();
        this.inventory.add(new Item("Potion", 20));
    }

    public boolean fight(Enemy enemy) {
        Random rand = new Random();
        boolean specialAttack = rand.nextInt(100) < 30;
        boolean attackMissed = rand.nextInt(100) < 10;

        if (attackMissed) {
            System.out.println("Hero missed the attack on " + enemy.getName() + "!");
            return false;
        }

        double damage = specialAttack ? attackPower * (rand.nextInt(2) + 2) : attackPower;
        enemy.setHealth(enemy.getHealth() - damage);

        System.out.println("Hero dealt " + damage + " damage to " + enemy.getName() +
                (specialAttack ? " with a Special Attack!" : "."));

        return true;
    }

    public void useItem(int index) {
        if (index < 0 || index >= inventory.size()) {
            System.out.println("Invalid item selection.");
            return;
        }

        Item item = inventory.remove(index);
        this.health += item.getHealingPower();
        System.out.println("A " + item.getName() + " healed Hero by " + item.getHealingPower() + " HP.");
    }

    public void levelUp() {
        if (experience >= 100) {
            level++;
            experience = 0;
            health *= 1.1;
            attackPower *= 1.1;
            System.out.println("Hero leveled up to " + level + "! Health and attack power increased.");
        }
    }

    public boolean addToInventory(Item item) {
        if (inventory.size() >= 10) {
            return false;
        }
        inventory.add(item);
        return true;
    }

    public String showInventory() {
        return inventory.toString();
    }

    @Override
    public String info() {
        return "Hero - Level: " + level + ", HP: " + health + ", Attack: " + attackPower + ", Money: " + money;
    }
}
