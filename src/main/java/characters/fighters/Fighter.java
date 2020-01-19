package characters.fighters;

import characters.magicUsers.MagicUser;
import characters.Player;
import components.WeaponType;
import interfaces.IDefend;

public abstract class Fighter extends Player {

    private WeaponType weapon;

    public Fighter(String name, int maxHP, String catchPhrase, WeaponType weapon) {
        super(name, maxHP, catchPhrase);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return this.weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public void attack(Player character) {

            if (character instanceof IDefend) {
                int damage = this.weapon.getDamage() - ((IDefend) character).defend();
                character.loseHP(damage);
            }
            else {
                int damage = this.weapon.getDamage();
                character.loseHP(damage);
            }
        }
    }

