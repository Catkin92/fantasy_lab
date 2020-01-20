package Rooms;

import characters.Player;
import characters.fighters.Dwarf;

public class TreasureRoom {

    private int gold;

    public TreasureRoom(int gold) {
        this.gold = gold;
    }

    public String openChest(Player character) {
        character.addGold(this.gold);
       return "You opened the chest and found " + this.gold + " gold!";
    }
}
