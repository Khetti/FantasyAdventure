package characterTest;

import Weapon.Weapon;
import character.Cleric;
import character.Goblin;
import loot.Treasure;
import org.junit.Before;
import org.junit.Test;
import spellbook.SpellBook;

import static junit.framework.TestCase.assertEquals;

public class GoblinTest {
    Goblin goblin;
    Weapon weapon;
    Treasure treasure;

    @Before
    public void setUp() {
        goblin = new Goblin("Minsc", 70, 10, 0);
        weapon = new Weapon("Axe", 5, 1);
        treasure = new Treasure("The Black Ruby of Voldesad", "A gem of great value", 100);
    }

    @Test
    public void canGetName() {
        assertEquals("Minsc", goblin.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(70, goblin.getHP(), 0);
    }

    @Test
    public void canSetHP() {
        goblin.setHP(90);
        assertEquals(90, goblin.getHP(), 0);
    }

    @Test
    public void canGetDamage() {
        assertEquals(10, goblin.getDamage(), 0);
    }

    @Test
    public void canSetDamage() {
        goblin.setDamage(12);
        assertEquals(12, goblin.getDamage(), 0);
    }

    @Test
    public void canGetGold() {
        assertEquals(0, goblin.getGold());
    }

    @Test
    public void canSetGold() {
        goblin.setGold(100);
        assertEquals(100, goblin.getGold());
    }

    @Test
    public void canAddGold() {
        goblin.addGold(10);
        assertEquals(10, goblin.getGold());
    }

    @Test
    public void canAddWeapon() {
        goblin.addWeapon(weapon);
        assertEquals(1, goblin.getNumberWeapon());
    }

    @Test
    public void canAddTreasure() {
        goblin.addTreasure(treasure);
        assertEquals(1, goblin.getNumberTreasure());
    }

    @Test
    public void canBattleCry() {
        goblin.battleCry();
        assertEquals(20, goblin.getDamage(), 0);
    }

    @Test
    public void canAttack(){
        Cleric cleric = new Cleric("cleric", 90, 5, 0, SpellBook.HEAL);
        goblin.attack(cleric, weapon);
        assertEquals(75, cleric.getHP(), 0.00);
    }

    @Test
    public void canAttackBattleCry(){
        Cleric cleric = new Cleric("cleric", 90, 5, 0, SpellBook.HEAL);
        goblin.battleCry();
        goblin.attack(cleric, weapon);
        assertEquals(65, cleric.getHP(), 0.00);
    }
}
