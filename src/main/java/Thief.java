import java.util.ArrayList;

public class Thief extends Character {
    public Thief(String name, double HP, double damage) {
        super(name, HP, damage);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }

    @Override
    public String getName(String name) {
        return this.name;
    }

    @Override
    public double getHP() {
        return this.HP;
    }

    @Override
    public void setHP(double HP) {
        this.HP = HP;
    }

    @Override
    public double getDamage() {
        return 0.0;
    }

    @Override
    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public ArrayList<Weapon> getWeapons() {
        return null;
    }

    @Override
    public void setWeapons(ArrayList<Weapon> weapons) {

    }

    @Override
    public ArrayList<Treasure> getLoot() {
        return null;
    }

    @Override
    public void setLoot(ArrayList<Treasure> loot) {

    }
}
