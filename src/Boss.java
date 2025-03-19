public class Boss extends Enemy {
    private int ultrasLeft;

    public Boss(double health, double attackPower, boolean isAlive) {
        super(health, attackPower, isAlive);
        this.ultrasLeft = 3;
    }

    @Override
    public boolean fight() {
        Random rand = new Random();
        boolean useUltra = rand.nextInt(100) < 30 && ultrasLeft > 0;
        boolean attackMissed = rand.nextInt(100) < 10;

        if (attackMissed) {
            System.out.println("Boss missed the attack!");
            return false;
        }

        double damage = useUltra ? attackPower * 3 : attackPower;
        if (useUltra) {
            ultrasLeft--;
        }

        System.out.println("Boss dealt " + damage + " damage" + (useUltra ? " using an Ultra Attack!" : "."));
        return true;
    }

    @Override
    public String info() {
        return "Boss - HP: " + health + ", Attack: " + attackPower + ", Ultras Left: " + ultrasLeft;
    }
}
