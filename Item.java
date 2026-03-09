class Item {

    String name;

    public Item(String name) {
        this.name = name;
    }
}

class Inventory {

    Item[] items = new Item[10];
}

class Potion extends Item {

    public Potion() {
        super("Potion");
    }
}

class Weapon extends Item {

    public Weapon() {
        super("Sword");
    }
}