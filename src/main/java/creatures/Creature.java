package creatures;

public abstract class Creature {

    private String name;
    private int defence;
    private int attack;
    private int maxHP;
    private int currentHP;

    public Creature(String name, int defence, int attack, int maxHP) {
        this.name = name;
        this.defence = defence;
        this.attack = attack;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    }

    public String getName() {
        return this.name;
    };

    public int getDefence() {
        return this.defence;
    };

    public int getAttack() {
        return this.attack;
    };

    public int getMaxHP() {
        return this.maxHP;
    }

    public int getCurrentHP() {
        return this.currentHP;
    }

    public void loseHP(int damage) {
        this.currentHP -= damage;
    }

}
