import creatures.Dragon;
import creatures.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    private Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre("Shrek", 3, 15, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Shrek", ogre.getName());
    }

    @Test
    public void hasDefence() {
        assertEquals(3, ogre.getDefence());
    }

    @Test
    public void hasAttack() {
        assertEquals(15, ogre.getAttack());
    }

    @Test
    public void hasMaxHP() {
        assertEquals(20, ogre.getMaxHP());
    }
}


