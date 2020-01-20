import creatures.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DragonTest {

    private Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Snarly", 4, 25, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Snarly", dragon.getName());
    }

    @Test
    public void hasDefence() {
        assertEquals(4, dragon.getDefence());
    }

    @Test
    public void hasAttack() {
        assertEquals(25, dragon.getAttack());
    }
}
