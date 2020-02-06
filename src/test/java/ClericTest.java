import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private  Weapon weapon;


    @Before
    public void before(){
        cleric = new Cleric("cleric", 90, 5, 0, SpellBook.HEAL);
        weapon = new Weapon("sword", 10, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("cleric", cleric.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(90, cleric.getHP(), 0.000);
    }

    @Test
    public void canGetDamage(){
        assertEquals(5, cleric.getDamage(), 0.00);
    }

    @Test
    public void canSetHP(){
        cleric.setHP(50);
        assertEquals(50, cleric.getHP(), 0.00);
    }

    @Test
    public void canSetDamage(){
        cleric.setDamage(50);
        assertEquals(50, cleric.getDamage(), 0.00);
    }

    @Test
    public void canAddWeapon(){
        cleric.addWeapon(weapon);
        assertEquals(1, cleric.getNumberWeapon());
    }

    @Test
    public void goldStartATZero(){
        assertEquals(0, cleric.getGold());
    }

    @Test
    public void canHeal(){
        cleric.heal(cleric);
        assertEquals(100, cleric.getHP(), 0.00);
    }

    @Test
    public void canAttack(){
        Thief thief = new Thief("thief", 60, 20, 0);
        cleric.attack(thief, weapon);
        assertEquals(45, thief.getHP(), 0.00);
    }
}
