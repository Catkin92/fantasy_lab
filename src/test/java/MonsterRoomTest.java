import Rooms.MonsterRoom;
import characters.fighters.Dwarf;
import components.WeaponType;
import creatures.Ogre;
import org.junit.Before;
import org.junit.Test;

public class MonsterRoomTest {

    private MonsterRoom room;
    private Dwarf dwarf;
    private Ogre ogre;

    @Before
    public void before() {
        dwarf = new Dwarf("Gimli", 30, "Nobody tosses a dwarf!", WeaponType.CLUB);
        ogre = new Ogre("Shrek", 3, 15, 10);
        room = new MonsterRoom(ogre);
    }

}
