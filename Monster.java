
public class Monster extends Character {
    public Monster(String name, int maxHp){
        super(name, maxHp);
    }

    public int attack(){
        return Dice.roll(3,8); // weaker attack
    }
}