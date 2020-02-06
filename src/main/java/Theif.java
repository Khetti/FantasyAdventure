import java.util.ArrayList;

public class Theif extends Character {
    public Theif(String name, int HP, int damage) {
        super(name, HP, damage);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }
}
