package players;

import weapons.Weapon;

public abstract class Player {

    private String name;
    private int healthPoints;
    private Weapon weapon;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
