package Weapon;

public class Weapon {

    String name;
    double damage;
    double range;

    public Weapon(String name, double damage, double range) {

        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public double getRange() {
        return range;
    }
}
