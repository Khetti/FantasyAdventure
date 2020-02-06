package character;

import Weapon.Weapon;

import java.util.ArrayList;

public abstract class Character {

    String name;
    double HP;
    double damage;
    int gold;
    ArrayList<Weapon> weapons;
    ArrayList<Treasure> loot;

    public Character(String name, double HP, double damage, int gold) {
        this.name = name;
        this.HP = HP;
        this.damage = damage;
        this.gold = gold;
        this.weapons = new ArrayList<Weapon>();
        this.loot = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Treasure> getLoot() {
        return loot;
    }

    public int getNumberWeapon(){
        return this.weapons.size();
    }

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }

    public int getNumberTreasure(){
        return this.loot.size();
    }

    public void addTreasure(Treasure treasure){
        this.loot.add(treasure);
    }

    public void attack(Character character, Weapon weapon){
        double damage =  this.damage + weapon.getDamage();
        double hp = character.getHP();
        double newHP = hp - damage;
        character.setHP(newHP);
    }
}
