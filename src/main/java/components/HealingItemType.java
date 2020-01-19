package components;

public enum HealingItemType {

    RUNESTONE(10),
    HERBALTEA(3),
    SHINYCRYSTAL(7);

    private final int healing;

    HealingItemType(int healing) {
        this.healing = healing;
    }

    public int getHealing() {
        return this.healing;
    }
}
