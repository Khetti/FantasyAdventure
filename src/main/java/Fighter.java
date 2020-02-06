import java.util.ArrayList;

public class Fighter extends Character {

    public Fighter(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }

    public void battleCry() {
        this.damage = (this.damage * 2);
    }

}
