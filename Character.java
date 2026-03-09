class Character {

    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }
}

class Player extends Character {

    public Player(String name, int health) {
        super(name, health);
    }
}

class Enemy extends Character {

    public Enemy(String name, int health) {
        super(name, health);
    }
}

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
