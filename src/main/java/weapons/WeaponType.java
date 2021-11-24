package weapons;

public enum WeaponType {
    SWORD(10),
    CLUB(1),
    AXE(8),
    SPEAR(6),
    BOW_AND_ARROW(7),
    STAFF(4),
    WAND(2);

    private final int damageDealt;

    WeaponType(int damageDealt) {
        this.damageDealt = damageDealt;
    }

    public int getDamageDealt() {
        return damageDealt;
    }
}
