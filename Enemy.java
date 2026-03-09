class Enemy extends Character {

    public Enemy(String name, int health) {
        super(name, health);
    }
}

class EnemyAI {

    public void takeTurn(Enemy enemy, Player player) {

        Attack attack = new Attack();
        attack.execute(enemy, player);
    }
}

//Enemy types

class Goblin extends Enemy {

    public Goblin() {
        super("Goblin", 60);
    }
}

class Dragon extends Enemy {

    public Dragon() {
        super("Dragon", 200);
    }
}
