package characters.magicUsers;

import characters.magicUsers.MagicUser;
import creatures.Creature;

public class Warlock extends MagicUser {

    public Warlock(String name, int maxHP, String catchPhrase, Creature creature) {
        super(name, maxHP, catchPhrase, creature);
    }
}
