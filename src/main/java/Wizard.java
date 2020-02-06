
import java.util.ArrayList;

public class Wizard extends Character {

//    private ArrayList<SpellBook> spells;
    Spellbook

    public Wizard(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
        this.spells = new ArrayList<SpellBook>();
//        populateSpells();
    }

//    public void populateSpells(){
//        for (SpellBook spell : SpellBook.values)
//    }

    public void castDamageSpell(Character character, String chosenSpell) {
        int spellDamage = Spellbook.values(chosenSpell);
    }

}
