import java.util.Random;
import java.util.Scanner;

class BattleSystem {

    public void startBattle(Player player, Enemy enemy) {

        Scanner sc = new Scanner(System.in);

        while (player.isAlive() && enemy.isAlive()) {

            System.out.println("1. Attack");
            System.out.println("2. Defend");

            int choice = sc.nextInt();

            if (choice == 1) {
                Attack attack = new Attack();
                attack.execute(player, enemy);
            }

            EnemyAI ai = new EnemyAI();
            ai.takeTurn(enemy, player);

            System.out.println(player.name + " HP: " + player.health);
            System.out.println(enemy.name + " HP: " + enemy.health);
        }

        System.out.println("Battle Ended");
    }
}
