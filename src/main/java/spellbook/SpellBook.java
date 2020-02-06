package spellbook;

public enum SpellBook {

    FIREBALL(30),
    HEAL(10);

    private final int value;

    SpellBook(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
