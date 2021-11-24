import org.junit.Before;
import org.junit.Test;
import players.Melee;
import players.Player;
import weapons.Weapon;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void setUp(){
        weapon = new Weapon(WeaponType.SWORD);
    }

    @Test
    public void hasWeaponType(){
        assertEquals(WeaponType.SWORD, weapon.getWeaponType());
    }

    @Test
    public void hasAttack(){
        assertEquals(10, weapon.getAttack());
    }
}
