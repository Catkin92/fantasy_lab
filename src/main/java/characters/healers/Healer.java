package characters.healers;

import characters.Player;
import components.HealingItemType;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private ArrayList<HealingItemType> inventory;

    public Healer(String name, int maxHP, String catchPhrase) {
        super(name, maxHP, catchPhrase);
        this.inventory = new ArrayList<HealingItemType>();
    }

    public ArrayList<HealingItemType> getInventory() {
        ArrayList<HealingItemType> list = new ArrayList<HealingItemType>(inventory);
        return list;
    }

    public void addHealingItem(HealingItemType healingItem) {
        this.inventory.add(healingItem);
    }

    public void removeHealingItem(HealingItemType healingItem) {
        this.inventory.remove(healingItem);
    }

    public boolean hasItem(HealingItemType item) {
        return this.inventory.contains(item);
    }

    public String heal(Player character, HealingItemType healingItem) {
        if(this.hasItem(healingItem)) {
            int heal = healingItem.getHealing();
            character.gainHP(heal);

            this.removeHealingItem(healingItem);

            return this.getCatchPhrase();
        }
        return "You don't have that item";
    }
}
