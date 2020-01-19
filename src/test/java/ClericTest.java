import characters.healers.Cleric;

import components.HealingItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    private Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric("Florence", 50, "Yir healed!");
    }

    @Test
    public void canGetName() {
        assertEquals("Florence", cleric.getName());
    }

    @Test
    public void canReturnMaxHP() {
        assertEquals(50, cleric.getMaxHP());
    }

    @Test
    public void canReturnCatchPhrase() {
        assertEquals("Yir healed!", cleric.getCatchPhrase());
    }

    @Test
    public void canReturnCurrentHP() {
        assertEquals(50, cleric.getCurrentHP());
    }

    @Test
    public void canLoseHP() {
        cleric.loseHP(10);
        assertEquals(40, cleric.getCurrentHP());
    }
//
    @Test
    public void canGainHP() {
        cleric.loseHP(15);
        cleric.gainHP(10);
        assertEquals(45, cleric.getCurrentHP());
    }

    @Test
    public void cannotHealMoreThanMaxHP() {
        cleric.loseHP(10);
        cleric.gainHP(20);
        assertEquals(50, cleric.getCurrentHP());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, cleric.getInventory().size());
    }

    @Test
    public void canAddHealingItem() {
        cleric.addHealingItem(HealingItemType.RUNESTONE);
        assertEquals(1, cleric.getInventory().size());
    }

    @Test
    public void canRemoveHealingItem() {
        cleric.addHealingItem(HealingItemType.HERBALTEA);
        cleric.removeHealingItem(HealingItemType.HERBALTEA);
    assertEquals(0, cleric.getInventory().size());
    }

    @Test
    public void hasHealingItem() {
        cleric.addHealingItem(HealingItemType.SHINYCRYSTAL);
        assertTrue(cleric.hasItem(HealingItemType.SHINYCRYSTAL));
        assertFalse(cleric.hasItem(HealingItemType.RUNESTONE));
    }

    @Test
    public void canHeal() {
        cleric.addHealingItem(HealingItemType.SHINYCRYSTAL);
        cleric.loseHP(20);
        cleric.heal(cleric, HealingItemType.SHINYCRYSTAL);
        assertEquals(37, cleric.getCurrentHP());
        assertEquals(0, cleric.getInventory().size());
    }

    @Test
    public void healingReturnsCatchphrase() {
        cleric.addHealingItem(HealingItemType.RUNESTONE);
        cleric.loseHP(20);
        assertEquals("Yir healed!", cleric.heal(cleric, HealingItemType.RUNESTONE));
    }

    @Test
    public void cannotHeal() {
        assertEquals("You don't have that item", cleric.heal(cleric, HealingItemType.RUNESTONE));
    }
}
