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

    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Treasure> getLoot() {
        return loot;
    }

    public int getNumberWeapon(){
        return this.weapons.size();
    }

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }
}
