import Rooms.TreasureRoom;
import characters.fighters.Dwarf;
import components.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    private TreasureRoom room;
    private Dwarf dwarf;

    @Before
    public void before() {
        room = new TreasureRoom(50);
        dwarf = new Dwarf("Gimli", 30, "Nobody tosses a dwarf!", WeaponType.CLUB);
    }

    @Test
    public void canOpenChest() {
        assertEquals("You opened the chest and found 50 gold!", room.openChest(dwarf));
    }

    @Test
    public void canAddGoldWhenOpensChest() {
        room.openChest(dwarf);
        assertEquals(50, dwarf.getGold());
    }
}
