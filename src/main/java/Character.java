import java.util.ArrayList;

public abstract class Character {

    String name;
    double HP;
    double damage;
    ArrayList<Weapon> weapons;
    ArrayList<Treasure> loot;

    public Character(String name, double HP, double damage) {
        this.name = name;
        this.HP = HP;
        this.damage = damage;
        this.weapons = new ArrayList<Weapon>();
        this.loot = new ArrayList<Treasure>();
    }


    public abstract String getName(String name);

    public abstract int getHP();

    public abstract void setHP(int HP);

    public abstract int getDamage();

    public abstract void setDamage(int damage);

    public abstract ArrayList<Weapon> getWeapons();

    public abstract void setWeapons(ArrayList<Weapon> weapons);

    public abstract ArrayList<Treasure> getLoot();

    public abstract void setLoot(ArrayList<Treasure> loot);
}
