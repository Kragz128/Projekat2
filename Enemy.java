package igrica;

public class Enemy extends GameObject {
    private EnemyType type;
    protected int damage;
    protected int health;

    public Enemy(String name, EnemyType type, int x, int y, int width, int height, int damage, int health) {
        super(name, x, y, width, height);
        this.type = type;
        this.damage = damage;
        this.health = health;
    }

    public int getDamage() {
        if (type == EnemyType.BOSS) {
            return damage * 2;
        }
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
        logEvent("Enemy " + name + " took " + damage + " damage. HP = " + health);
    }

    @Override
    public void update() {
        System.out.println(name + " napada.");
    }

    @Override
    public String toString() {
        String enemyLabel = (type == EnemyType.BOSS) ? "BossEnemy" : "MeleeEnemy";
        String dmgText = (type == EnemyType.BOSS) ? damage + "*2" : String.valueOf(damage);

        return enemyLabel + "{" + name + "} @ (" + x + ", " + y + ") " +
                width + "x" + height + " DMG = " + dmgText + " HP = " + health;
    }
}