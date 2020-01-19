package characters.fighters;

import characters.fighters.Fighter;
import components.ArmourType;
import components.WeaponType;
import interfaces.IDefend;

public class Knight extends Fighter implements IDefend {

    private ArmourType armour;

    public Knight(String name, int maxHP, String catchPhrase, WeaponType weapon, ArmourType armour) {
        super(name, maxHP, catchPhrase, weapon);
        this.armour = armour;
    }

    public ArmourType getArmour() {
        return this.armour;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }

    public int defend() {
        return this.armour.getDefence();
    }
}
