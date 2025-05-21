package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArcherTest {

    @Test
    void archerCreation() {
        Archer archer = new Archer("Legolas");
        assertEquals("Legolas", archer.getName());
        assertEquals(3, archer.getStrength());
        assertEquals(10, archer.getAgility());
        assertEquals(5, archer.getIntelligence());
    }

    @Test
    void archerAttack() {
        Archer archer = new Archer("Legolas");
        Warrior target = new Warrior("Target");

        int initialHealth = target.getHealth();
        archer.attack(target);

        assertEquals(initialHealth - archer.getAgility(), target.getHealth());
    }

    @Test
    void archerAttackCannotMakeHealthNegative() {
        Archer archer = new Archer("Legolas");
        Character target = new Warrior("WeakTarget");
        target.setHealth(5); // устанавливаем мало здоровья

        archer.attack(target);
        assertEquals(0, target.getHealth()); // здоровье не должно уйти в минус
    }
}