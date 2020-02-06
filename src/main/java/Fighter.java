import java.util.ArrayList;

public class Fighter extends Character {

    public Fighter(String name, double HP, double damage) {
        super(name, HP, damage);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }


}
