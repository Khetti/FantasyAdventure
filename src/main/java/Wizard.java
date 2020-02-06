import java.util.ArrayList;

public class Wizard extends Character {

    public Wizard(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }

    public void damageSpell() {

    }

}
