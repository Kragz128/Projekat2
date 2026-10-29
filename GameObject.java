package igrica;

public abstract class GameObject {
    protected String name;
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public GameObject(String name, int x, int y, int width, int height) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean collidesWith(GameObject other) {
        return this.x < other.x + other.width &&
               this.x + this.width > other.x &&
               this.y < other.y + other.height &&
               this.y + this.height > other.y;
    }

    public void logEvent(String message) {
        EventLog.add(message);
    }

    public abstract void update();
}