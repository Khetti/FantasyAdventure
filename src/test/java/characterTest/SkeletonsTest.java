package characterTest;

import Weapon.Weapon;
import character.Ranger;
import character.Skeletons;
import character.Thief;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SkeletonsTest {

    private Skeletons skeletons;
    private Weapon weapon;


    @Before
    public void before(){
        skeletons = new Skeletons("Skeleton", 60, 10, 0);
        weapon = new Weapon("sword", 10, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Skeleton", skeletons.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(60, skeletons.getHP(), 0.000);
    }

    @Test
    public void canGetDamage(){
        assertEquals(10, skeletons.getDamage(), 0.00);
    }

    @Test
    public void canSetHP(){
        skeletons.setHP(50);
        assertEquals(50, skeletons.getHP(), 0.00);
    }

    @Test
    public void canSetDamage(){
        skeletons.setDamage(50);
        assertEquals(50, skeletons.getDamage(), 0.00);
    }

    @Test
    public void canAddWeapon(){
        skeletons.addWeapon(weapon);
        assertEquals(1, skeletons.getNumberWeapon());
    }

    @Test
    public void goldStartATZero(){
        assertEquals(0, skeletons.getGold());
    }

    @Test
    public void canHeal(){
        skeletons.shapeShift();
        assertEquals(120, skeletons.getHP(), 0.00);
        assertEquals(15, skeletons.getDamage(), 0.00);
    }

    @Test
    public void canAttack(){
        Thief thief = new Thief("thief", 60, 20, 0);
        skeletons.attack(thief, weapon);
        assertEquals(40, thief.getHP(), 0.00);
    }

}
