import java.util.ArrayList;

public class Inventory {

    ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
        items.add(new Potion("Small Potion", 20));
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showInventory() {

        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ": " + items.get(i).name);
        }
    }

    public void usePotion(Player player) {

        for (Item item : items) {

            if (item instanceof Potion) {
                item.use(player);
                items.remove(item);
                return;
            }
        }

        System.out.println("No potion available.");
    }
}