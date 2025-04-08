package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    @Test
    void characterCreationWithFullParams() {
        Character character = new Warrior("TestWarrior"); // используем Warrior как конкретную реализацию
        assertEquals("TestWarrior", character.getName());
        assertEquals(10, character.getStrength());
        assertEquals(5, character.getAgility());
        assertEquals(3, character.getIntelligence());
        assertEquals(100, character.getHealth());
    }

    @Test
    void characterCreationWithDefaultParams() {
        Character character = new Archer("TestArcher");
        assertEquals("TestArcher", character.getName());
        assertEquals(3, character.getStrength());
        assertEquals(10, character.getAgility());
        assertEquals(5, character.getIntelligence());
    }

    @Test
    void healthSetterWorksCorrectly() {
        Character character = new Warrior("Test");
        character.setHealth(50);
        assertEquals(50, character.getHealth());

        character.setHealth(-10);
        assertEquals(0, character.getHealth()); // health не может быть меньше 0
    }
}