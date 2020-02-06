package spellbook;

public class Spell {
    private SpellBook spell;

    public Spell(SpellBook spell) {
        this.spell = spell;
    }

    public SpellBook getSpell() {
        return spell;
    }

    public int getSpellValue(){
       return this.spell.getValue();
    }
}
