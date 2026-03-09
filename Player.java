public class Player {

    String name;
    int health;
    int attack;
    int defense;

    Inventory inventory;

    public Player(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        inventory = new Inventory();
    }

    public void attack(Enemy enemy) {
        int damage = attack - enemy.defense;
        if (damage < 0) damage = 0;

        enemy.takeDamage(damage);
        System.out.println(name + " dealt " + damage + " damage!");
    }

    public void takeDamage(int dmg) {
        health -= dmg;
    }

    public boolean isAlive() {
        return health > 0;
    }
}