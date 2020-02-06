package character;

import Weapon.Weapon;
import loot.Treasure;

import java.util.ArrayList;

public class Thief extends Character {
    public Thief(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
    }

    public void pickPocket(){
        addGold(10);
    }

}
