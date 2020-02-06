import Weapon.Weapon;
import character.Wizard;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;
    Weapon weapon;
    Treasure treasure;

    @Before
    public void setUp() {
        wizard = new Wizard("Edwin", 30, 3, 0);
        weapon = new Weapon("Staff", 1, 1);
        treasure = new Treasure("Tome of Forbidden Knowledge", "The text is indecipherable.", 20);
    }

    @Test
    public void canGetName() {
        assertEquals("Edwin", wizard.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(30, wizard.getHP(), 0);
    }

    @Test
    public void canSetHP() {
        wizard.setHP(35);
        assertEquals(35, wizard.getHP(), 0);
    }

    @Test
    public void canGetDamage() {
        assertEquals(3, wizard.getDamage(), 0);
    }

    @Test
    public void canSetDamage() {
        wizard.setDamage(4);
        assertEquals(4, wizard.getDamage(), 0);
    }

    @Test
    public void canGetGold() {
        assertEquals(0, wizard.getGold());
    }

    @Test
    public void canSetGold() {
        wizard.setGold(100);
        assertEquals(100, wizard.getGold());
    }

    @Test
    public void canAddGold() {
        wizard.addGold(10);
        assertEquals(10, wizard.getGold());
    }

    @Test
    public void canAddWeapon() {
        wizard.addWeapon(weapon);
        assertEquals(1, wizard.getNumberWeapon());
    }

    @Test
    public void canAddTreasure() {
        wizard.addTreasure(treasure);
        assertEquals(1, wizard.getNumberTreasure());
    }

}
