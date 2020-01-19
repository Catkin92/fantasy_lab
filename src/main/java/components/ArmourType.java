package components;

public enum ArmourType {

    GOLD(1),
    IRON(2),
    ADAMANTIUM(4);


    private final int defence;

    ArmourType(int defence) {
        this.defence = defence;
    }

    public int getDefence() {
        return this.defence;
    }
}
