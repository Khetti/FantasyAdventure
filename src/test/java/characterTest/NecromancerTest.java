package characterTest;

import Weapon.Weapon;
import character.Cleric;
import character.Necromancer;
import character.Thief;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NecromancerTest {

    private Necromancer necromancer;
    private Weapon weapon;


    @Before
    public void before(){
        necromancer = new Necromancer("Ghastreaver", 90, 5, 0);
        weapon = new Weapon("sword", 10, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Ghastreaver", necromancer.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(90, necromancer.getHP(), 0.000);
    }

    @Test
    public void canGetDamage(){
        assertEquals(5, necromancer.getDamage(), 0.00);
    }

    @Test
    public void canSetHP(){
        necromancer.setHP(50);
        assertEquals(50, necromancer.getHP(), 0.00);
    }

    @Test
    public void canSetDamage(){
        necromancer.setDamage(50);
        assertEquals(50, necromancer.getDamage(), 0.00);
    }

    @Test
    public void canAddWeapon(){
        necromancer.addWeapon(weapon);
        assertEquals(1, necromancer.getNumberWeapon());
    }

    @Test
    public void goldStartATZero(){
        assertEquals(0, necromancer.getGold());
    }

    @Test
    public void canHeal(){
        necromancer.heal(necromancer);
        assertEquals(100, necromancer.getHP(), 0.00);
    }

    @Test
    public void canAttack(){
        Thief thief = new Thief("thief", 60, 20, 0);
        necromancer.attack(thief, weapon);
        assertEquals(45, thief.getHP(), 0.00);
    }
}
