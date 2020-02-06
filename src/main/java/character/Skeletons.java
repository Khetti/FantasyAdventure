package character;

public class Skeletons extends Character {

    public Skeletons(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
    }

    public void shapeShift() {
        this.HP *= 2;
        this.damage *= 1.5;
    }
}
