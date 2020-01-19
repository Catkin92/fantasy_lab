package characters.magicUsers;

import characters.Player;
import components.SpellType;
import creatures.Creature;
import interfaces.IDefend;


import java.util.ArrayList;


public abstract class MagicUser extends Player implements IDefend {

    private ArrayList<SpellType> spells;
    private Creature creature;

    public MagicUser(String name, int maxHP, String catchPhrase, Creature creature) {
        super(name, maxHP, catchPhrase);
        this.spells = new ArrayList<SpellType>();
        this.creature = creature;
    }

    public ArrayList<SpellType> getSpells() {
        ArrayList<SpellType> spellList = new ArrayList<SpellType>(spells);
        return spellList;
    }

    public Creature getCreature() {
        return this.creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public void addSpell(SpellType spell) {
        this.spells.add(spell);
    }

    public int defend() {
        return this.creature.getDefence();
    }

    public void attack(Player character, SpellType spell) {
        if(this.spells.contains(spell)) {

            if (character instanceof IDefend) {
                int damage = spell.getDamage() - ((IDefend) character).defend();
                character.loseHP(damage);
            } else {
                character.loseHP(spell.getDamage());
            }
        }
    }
}
