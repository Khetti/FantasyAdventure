package character;

import spellbook.SpellBook;

public class Warlock extends Character implements IEnemy {

    private SpellBook spell;

    public Warlock(String name, double HP, double damage, int gold, SpellBook spell)
    {
        super(name, HP, damage, gold);
        this.spell = spell;
    }
}
