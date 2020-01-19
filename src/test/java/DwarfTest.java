import characters.fighters.Dwarf;
import characters.healers.Cleric;
import components.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Cleric cleric;

    @Before
    public void before() {
        dwarf = new Dwarf("Gimli", 30, "Nobody tosses a dwarf!", WeaponType.CLUB);
        cleric = new Cleric("Florence", 50, "Yir healed!");
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canReturnMaxHP() {
        assertEquals(30, dwarf.getMaxHP());
    }

    @Test
    public void canReturnCatchPhrase() {
        assertEquals("Nobody tosses a dwarf!", dwarf.getCatchPhrase());
    }

    @Test
    public void canReturnCurrentHP() {
        assertEquals(30, dwarf.getCurrentHP());
    }

    @Test
    public void canLoseHP() {
        dwarf.loseHP(10);
        assertEquals(20, dwarf.getCurrentHP());
    }
    //
    @Test
    public void canGainHP() {
        dwarf.loseHP(15);
        dwarf.gainHP(10);
        assertEquals(25, dwarf.getCurrentHP());
    }

    @Test
    public void cannotHealMoreThanMaxHP() {
        dwarf.loseHP(10);
        dwarf.gainHP(20);
        assertEquals(30, dwarf.getCurrentHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.CLUB, dwarf.getWeapon());
    }

    @Test
    public void changeWeapon() {
        dwarf.setWeapon(WeaponType.AXE);
        assertEquals(WeaponType.AXE, dwarf.getWeapon());

    }

    @Test
    public void canAttack() {
        dwarf.attack(cleric);
        assertEquals(40, cleric.getCurrentHP());
    }
}
