package character;

public class Necromancer extends Character implements IEnemy {
    public Necromancer(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
    }


    public void heal(Character character) {
        double hp =  character.getHP();
        double newHP = hp + 10;
        character.setHP(newHP);
    }
}
