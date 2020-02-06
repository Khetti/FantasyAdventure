import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThiefTest {

    private Thief thief;
    private Weapon weapon;

    @Before
    public void before(){
        thief = new Thief("thief", 60, 20);
        weapon = new Weapon("sword", 10, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("thief", thief.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(60, thief.getHP(), 0.000);
    }

    @Test
    public void canGetDamage(){
        assertEquals(20, thief.getDamage(), 0.00);
    }

    @Test
    public void canSetHP(){
        thief.setHP(50);
        assertEquals(50, thief.getHP(), 0.00);
    }

    @Test
    public void canSetDamage(){
        thief.setDamage(50);
        assertEquals(50, thief.getDamage(), 0.00);
    }

    @Test
    public  void canAddWeapon(){
        thief.addWeapon(weapon);
        assertEquals(1, thief.getNumberWeapon());
    }
}
