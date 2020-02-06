package character;

public class Goblin extends Character implements IEnemy {

    public Goblin(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
    }

    public void battleCry() {
        this.damage *= 2;
    }
}
