import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    Fighter fighter;
    Weapon weapon;
    Treasure treasure;

    @Before
    public void setUp() {
        fighter = new Fighter("Minsc", 70, 10);
        weapon = new Weapon("Axe", 5, 1);
        treasure = new Treasure("The Black Ruby of Voldesad", "A gem of great value", 100);
    }

    @Test
    public void canGetName() {
        assertEquals("Minsc", fighter.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(70, fighter.getHP(), 0);
    }

    @Test
    public void canSetHP() {
        fighter.setHP(90);
        assertEquals(90, fighter.getHP(), 0);
    }

    @Test
    public void canGetDamage() {
        assertEquals(10, fighter.getDamage(), 0);
    }

    @Test
    public void canSetDamage() {
        fighter.setDamage(12);
        assertEquals(12, fighter.getDamage(), 0);
    }

    @Test
    public void canAddWeapon() {
        fighter.addWeapon(weapon)
    }

    @Test
    public void canAddTreasure() {
        fighter.addTreasure(treasure);
    }

}
