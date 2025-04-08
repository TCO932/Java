package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {
    @Test
    void testNull() {
        assertThrows(NullPointerException.class, () -> {
            User user = new User(null, 30, "Uber", "New York");
        });

        assertThrows(NullPointerException.class, () -> {
            User user = new User(null, 30, null, "New York");
        });

        assertThrows(NullPointerException.class, () -> {
            User user = new User(null, 30, null, null);
        });
    }

    @Test
    void testEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            User user = new User("", 30, "Uber", "New York");
        });
    }

    @Test
    void testAgeUnder18() {
        assertThrows(IllegalArgumentException.class, () -> {
            User user = new User("Alice", 17, "Amazon", "Amsterdam");
        });
    }

    @Test
    void testInvalidCompany() {
        assertThrows(IllegalArgumentException.class, () -> {
            User user = new User("Bob", 35, "Microsoft", "London");
        });
    }

    @Test
    void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            User user = new User("Charlie", 40, "Google", "Paris");
        });
    }
}