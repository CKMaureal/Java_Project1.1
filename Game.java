import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player player = new Player("Hero", 100, 15, 5);
        MapSystem map = new MapSystem();
        BattleSystem battle = new BattleSystem();

        while (player.isAlive()) {

            System.out.println("\nChoose direction:");
            System.out.println("1. North");
            System.out.println("2. South");
            System.out.println("3. East");
            System.out.println("4. West");

            int choice = sc.nextInt();

            String direction = "";

            switch (choice) {
                case 1: direction = "North"; break;
                case 2: direction = "South"; break;
                case 3: direction = "East"; break;
                case 4: direction = "West"; break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }

            Enemy enemy = map.move(direction);

            if (enemy != null) {
                battle.startBattle(player, enemy);
            }
        }

        System.out.println("Game Over.");

        sc.close();
    }
}