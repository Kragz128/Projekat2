package igrica;

public class BossEnemy extends Enemy {
    public BossEnemy(String name, int x, int y, int width, int height, int damage, int health) {
        super(name, EnemyType.BOSS, x, y, width, height, damage, health);
    }

    @Override
    public int getDamage() {
        return damage * 2;
    }

    @Override
    public String toString() {
        return "BossEnemy{" + name + "} @ (" + x + ", " + y + ") " +
                width + "x" + height + " DMG = " + damage + "*2 HP = " + health;
    }
}