package igrica;

public class Player extends GameObject {
    private int health;

    public Player(String name, int x, int y, int width, int height, int health) {
        super(name, x, y, width, height);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
        logEvent("Player " + name + " took " + damage + " damage. HP = " + health);
    }

    @Override
    public void update() {
        System.out.println(name + " se pomera.");
    }

    @Override
    public String toString() {
        return "Player{" + name + "} @ (" + x + ", " + y + ") " +
                width + "x" + height + " HP = " + health;
    }
}