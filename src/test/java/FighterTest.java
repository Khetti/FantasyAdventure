import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;
    Weapon weapon;
    Treasure treasure;

    @Before
    public void setUp() {
        fighter = new Fighter("Minsc", 70, 10);
        weapon = new Weapon("Axe", 5, 1);
        treasure = new Treasure("The Black Ruby of Voldesad", "A gem of great value.", 100);
    }

    @Test
    public void canGetName() {
        assertEquals("Minsc", fighter.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(70, fighter.getHP());
    }

    @Test
    public void canSetHP() {

    }

    @Test
    public void canGetDamage() {
        assertEquals(10, fighter.getDamage());
    }

    @Test
    public void canSetDamage() {

    }

}
