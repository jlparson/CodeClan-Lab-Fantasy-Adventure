package weapons;

public class Weapon {

    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getAttack() {
        return weaponType.getDamageDealt();
    }
}
