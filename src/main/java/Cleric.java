import java.util.ArrayList;

public class Cleric extends Character {

    public Cleric(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);

        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }

    public void heal(Character character) {
       double hp =  character.getHP();
       double newHP = hp + 10;
       character.setHP(newHP);
    }
}
