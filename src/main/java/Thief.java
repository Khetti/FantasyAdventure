import java.util.ArrayList;

public class Thief extends Character {
    public Thief(String name, double HP, double damage) {
        super(name, HP, damage);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }


}
