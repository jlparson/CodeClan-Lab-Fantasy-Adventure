package players;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Melee extends Player implements IWeapon {
    public Melee(String name, int healthPoints) {
        super(name, healthPoints);
    }

}
