import characters.fighters.Knight;
import characters.magicUsers.Wizard;
import components.ArmourType;
import components.SpellType;
import components.WeaponType;
import creatures.Dragon;
import creatures.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Knight knight;
    private Wizard wizard;
    private Ogre ogre;
    private Dragon dragon;

    @Before
    public void before() {
        ogre = new Ogre("Oggy", 6, 15);
        dragon = new Dragon("Snarly", 4, 25);
        wizard = new Wizard("Harry", 50, "I'm a what?", ogre);
        knight = new Knight("Eugene", 40, "Die die die!", WeaponType.AXE, ArmourType.IRON);
    }

    @Test
    public void canGetName() {
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void canReturnMaxHP() {
        assertEquals(50, wizard.getMaxHP());
    }

    @Test
    public void canReturnCatchPhrase() {
        assertEquals("I'm a what?", wizard.getCatchPhrase());
    }

    @Test
    public void canReturnCurrentHP() {
        assertEquals(50, wizard.getCurrentHP());
    }

    @Test
    public void canLoseHP() {
        wizard.loseHP(10);
        assertEquals(40, wizard.getCurrentHP());
    }
    //
    @Test
    public void canGainHP() {
        wizard.loseHP(15);
        wizard.gainHP(10);
        assertEquals(45, wizard.getCurrentHP());
    }

    @Test
    public void cannotHealMoreThanMaxHP() {
        wizard.loseHP(10);
        wizard.gainHP(20);
        assertEquals(50, wizard.getCurrentHP());
    }

    @Test
    public void spellsShouldStartEmpty() {
        assertEquals(0, wizard.getSpells().size());
    }

    @Test
    public void hasMythicalCreature() {
        assertEquals(ogre, wizard.getCreature());
    }

    @Test
    public void changeMythicalCreature() {
        wizard.setCreature(dragon);
        assertEquals(dragon, wizard.getCreature());
    }

    @Test
    public void canAddSpell() {
        wizard.addSpell(SpellType.LIGHTNINGSTRIKE);
        assertEquals(1, wizard.getSpells().size());
    }

    @Test
    public void canAttack() {
        wizard.addSpell(SpellType.POISON);
        wizard.attack(knight, SpellType.POISON);
        assertEquals(37, knight.getCurrentHP());
    }

    @Test
    public void magicUserOpponentCanDefend() {
        wizard.addSpell(SpellType.FIREBOLT);
        wizard.attack(wizard, SpellType.FIREBOLT);
        assertEquals(36, wizard.getCurrentHP());
    }
}


