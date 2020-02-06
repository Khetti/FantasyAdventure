package character;

import Weapon.Weapon;

import java.util.ArrayList;

public class Fighter extends Character implements Iplayer {

    public Fighter(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<loot.Treasure>();
    }

    public void battleCry() {
        this.damage *= 2;
    }

}
