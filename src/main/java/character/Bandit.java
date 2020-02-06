package character;

public class Bandit extends Character implements IEnemy {
    public Bandit(String name, double HP, double damage, int gold) {
        super(name, HP, damage, gold);
    }

    public void pickPocket(){
        addGold(10);
    }

}
