import java.util.ArrayList;

public abstract class Character {

    String name;
    int HP;
    int damage;
    ArrayList<Weapon> weapons;
    ArrayList<Treasure> loot

    public Character(String name, int HP, int damage) {
        this.name = name;
        this.HP = HP;
        this.damage = damage;
        this.weapons = new ArrayList<Weapon>();
        this.loot = new ArrayList<Treasure>();
    }

}
