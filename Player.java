public class Player extends Character {
    public Player(String name, int maxHp){
        super(name, maxHp);
    }

    public int attack(){
        return Dice.roll(5,10); // random damage 5-10
    }
}