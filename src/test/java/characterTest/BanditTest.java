package characterTest;

import Weapon.Weapon;
import character.Bandit;
import character.Cleric;
import character.Thief;
import org.junit.Before;
import org.junit.Test;
import spellbook.SpellBook;

import static junit.framework.TestCase.assertEquals;

public class BanditTest {

    private Bandit bandit;
    private Weapon weapon;

    @Before
    public void before(){
        bandit = new Bandit("bandit", 60, 20, 0);
        weapon = new Weapon("sword", 10, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("bandit", bandit.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(60, bandit.getHP(), 0.000);
    }

    @Test
    public void canGetDamage(){
        assertEquals(20, bandit.getDamage(), 0.00);
    }

    @Test
    public void canSetHP(){
        bandit.setHP(50);
        assertEquals(50, bandit.getHP(), 0.00);
    }

    @Test
    public void canSetDamage(){
        bandit.setDamage(50);
        assertEquals(50, bandit.getDamage(), 0.00);
    }

    @Test
    public void canAddWeapon(){
        bandit.addWeapon(weapon);
        assertEquals(1, bandit.getNumberWeapon());
    }

    @Test
    public void goldStartATZero(){
        assertEquals(0, bandit.getGold());
    }

    @Test
    public void canPickPocket(){
        bandit.pickPocket();
        assertEquals(10, bandit.getGold());
    }

    @Test
    public void canAttack(){
        Cleric cleric = new Cleric("cleric", 90, 5, 0, SpellBook.HEAL);
        bandit.attack(cleric, weapon);
        assertEquals(60, cleric.getHP(), 0.00);
    }

}
