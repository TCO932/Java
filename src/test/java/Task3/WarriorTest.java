package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
    void warriorCreation() {
        Warrior warrior = new Warrior("Conan");
        assertEquals("Conan", warrior.getName());
        assertEquals(10, warrior.getStrength());
        assertEquals(5, warrior.getAgility());
        assertEquals(3, warrior.getIntelligence());
    }

    @Test
    void warriorAttack() {
        Warrior warrior = new Warrior("Conan");
        Archer target = new Archer("Target");

        int initialHealth = target.getHealth();
        warrior.attack(target);

        assertEquals(initialHealth - warrior.getStrength(), target.getHealth());
    }

    @Test
    void warriorAttackCannotMakeHealthNegative() {
        Warrior warrior = new Warrior("Conan");
        Character target = new Archer("WeakTarget");
        target.setHealth(5); // устанавливаем мало здоровья

        warrior.attack(target);
        assertEquals(0, target.getHealth()); // здоровье не должно уйти в минус
    }
}