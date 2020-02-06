
import java.util.ArrayList;

public class Wizard extends Character {

    private SpellBook spell;

    public Wizard(String name, double HP, double damage, int gold, SpellBook spell) {
        super(name, HP, damage, gold);
        super.weapons = new ArrayList<Weapon>();
        super.loot = new ArrayList<Treasure>();
        this.spell = spell;
    }

    public SpellBook getSpell() {
        return this.spell;
    }

    public void setSpell(SpellBook newSpell) {
        this.spell = newSpell;
    }

    public void castSpell(Character character) {
        int spellDamage =  this.spell.getValue();
        double targetHP = character.getHP();
        double newHP = targetHP - spellDamage;
        character.setHP(newHP);
    }

}