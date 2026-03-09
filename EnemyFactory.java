public class EnemyFactory {

    public static Enemy createGoblin() {
        return new Enemy("Goblin", 40, 10, 2);
    }

    public static Enemy createOrc() {
        return new Enemy("Orc", 60, 15, 4);
    }
}