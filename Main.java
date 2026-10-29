package igrica;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero", 4, 7, 32, 32, 100);
        Enemy boss = new Enemy("GolbilKing", EnemyType.BOSS, 8, 5, 32, 32, 25, 120);

        System.out.println(player);
        System.out.println(boss);

        if (player.collidesWith(boss)) {
            System.out.println("Kolizija!");

            player.takeDamage(boss.getDamage());
            System.out.println("Player HP posle kolizije: " + player.getHealth());
        } else {
            System.out.println("Nema kolizije");
        }
    }
}