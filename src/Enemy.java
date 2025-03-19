public class Enemy extends Character {
    private int magicPower;

    public Enemy(double health, double attackPower, boolean isAlive) {
        super("EnemyName", health, attackPower, isAlive);
        this.magicPower = 30;
    }

    public boolean fight() {
        Random rand = new Random();
        boolean useMagic = rand.nextInt(100) < 40 && magicPower >= 10;
        boolean attackMissed = rand.nextInt(100) < 15;

        if (attackMissed) {
            System.out.println("Enemy missed the attack!");
            return false;
        }

        double damage = useMagic ? attackPower * 2 : attackPower;
        magicPower -= useMagic ? 10 : 0;

        System.out.println("Enemy dealt " + damage + " damage" + (useMagic ? " using Magic!" : "."));
        return true;
    }

    @Override
    public String info() {
        return "Enemy - HP: " + health + ", Attack: " + attackPower + ", Magic Power: " + magicPower;
    }
}
