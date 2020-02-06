package character;

import Weapon.Weapon;
import spellbook.SpellBook;


import java.util.ArrayList;

public class Cleric extends Character {

    private SpellBook spell;

    public Cleric(String name, double HP, double damage, int gold, SpellBook spell) {
        super(name, HP, damage, gold);

        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<loot.Treasure>();
        super.loot = new ArrayList<loot.Treasure>();
        this.spell = spell;

    }

    public SpellBook getSpell() {
        return this.spell;
    }

    public void setSpell(SpellBook newSpell) {
        this.spell = newSpell;
    }

    public void heal(Character character) {
       int spellHealing = this.spell.getValue();
       double hp =  character.getHP();
       double newHP = hp + spellHealing;
       character.setHP(newHP);
    }
}
