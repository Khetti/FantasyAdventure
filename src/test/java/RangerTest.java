import Weapon.Weapon;
import character.Ranger;
import character.Thief;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RangerTest {

    private Ranger ranger;
    private Weapon weapon;


    @Before
    public void before(){
        ranger = new Ranger("ranger", 60, 10, 0);
        weapon = new Weapon("sword", 10, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("ranger", ranger.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(60, ranger.getHP(), 0.000);
    }

    @Test
    public void canGetDamage(){
        assertEquals(10, ranger.getDamage(), 0.00);
    }

    @Test
    public void canSetHP(){
        ranger.setHP(50);
        assertEquals(50, ranger.getHP(), 0.00);
    }

    @Test
    public void canSetDamage(){
        ranger.setDamage(50);
        assertEquals(50, ranger.getDamage(), 0.00);
    }

    @Test
    public void canAddWeapon(){
        ranger.addWeapon(weapon);
        assertEquals(1, ranger.getNumberWeapon());
    }

    @Test
    public void goldStartATZero(){
        assertEquals(0, ranger.getGold());
    }

    @Test
    public void canHeal(){
        ranger.shapeShift();
        assertEquals(120, ranger.getHP(), 0.00);
        assertEquals(15, ranger.getDamage(), 0.00);
    }

    @Test
    public void canAttack(){
        Thief thief = new Thief("thief", 60, 20, 0);
        ranger.attack(thief, weapon);
        assertEquals(40, thief.getHP(), 0.00);
    }
}
