import java.util.ArrayList;

public class Ranger extends Character {
    public Ranger(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }

    public void shapeShift() {
        this.HP *= 2;
        this.damage *= 1.5;
    }
}
