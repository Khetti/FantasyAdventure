import java.util.ArrayList;

public class Fighter extends Character {

    public Fighter(String name, double HP, double damage) {
        super(name, HP, damage);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }

    @Override
    public void getName(String name) {

    }

    @Override
    public int getHP() {
        return 0;
    }

    @Override
    public void setHP(int HP) {

    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public void setDamage(int damage) {

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
