package Task4;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    void test() {
        User user1 = new User(1, "Анна", 25, Set.of("чтение", "плавание"));
        User user2 = new User(3, "Вася", 22, Set.of("чтение", "рисование"));
        User user3 = new User(2, "Иван", 30, Set.of("программирование", "плавание"));
        List<User> users = List.of(user1, user2, user3);

        Set<String> targetHobbies = Set.of("плавание", "рисование");
        Map<User, String> actual = User.findHobbyLovers(users, targetHobbies);

        Map<User, String> expected = new HashMap<>();
        expected.put(user1, "плавание");
        expected.put(user2, "рисование");
        expected.put(user3, "плавание");

        assertEquals(expected, actual);
    }
}