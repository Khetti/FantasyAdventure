package character;

import Weapon.Weapon;
import spellbook.SpellBook;
import spellbook.SpellBook;

import java.util.ArrayList;

public class Wizard extends Character {

//    private ArrayList<spellbook.SpellBook> spells;
    SpellBook spell;

    public Wizard(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<loot.Treasure>();
        this.spell = SpellBook.FIREBALL;
//        this.spells = new ArrayList<SpellBook>();
//        populateSpells();
    }

//    public void populateSpells(){
//        for (spellbook.SpellBook spell : spellbook.SpellBook.values)
//    }

    public void castDamageSpell(Character character, String chosenSpell) {
//        int spellDamage = Spellbook.values(chosenSpell);
    }

}
