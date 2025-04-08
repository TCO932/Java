package Task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void test() {
        List<User> users = new ArrayList<>();

        users.add(new User("Иван", 25, "Google", "Москва"));
        users.add(new User("Мария", 30, "Yandex", "Санкт-Петербург"));
        users.add(new User("Алексей", 25, "Mail.ru", "Казань"));
        users.add(new User("Ольга", 30, "Sber", "Новосибирск"));
        users.add(new User("Дмитрий", 28, "Tinkoff", "Екатеринбург"));
        users.add(new User("Анна", 25, "VK", "Самара"));
        users.add(new User("Сергей", 35, "Gazprom", "Краснодар"));
        users.add(new User("Елена", 28, "Ростелеком", "Воронеж"));

        Map<Integer, List<User>> actual = User.groupUsers(users);


        Map<Integer, List<User>> expected = new HashMap<>();
        expected.put(25, List.of(
            new User("Иван", 25, "Google", "Москва"),
            new User("Алексей", 25, "Mail.ru", "Казань"),
            new User("Анна", 25, "VK", "Самара")
        ));
        expected.put(28, List.of(
            new User("Дмитрий", 28, "Tinkoff", "Екатеринбург"),
            new User("Елена", 28, "Ростелеком", "Воронеж")
        ));
        expected.put(30, List.of(
            new User("Мария", 30, "Yandex", "Санкт-Петербург"),
            new User("Ольга", 30, "Sber", "Новосибирск")
        ));
        expected.put(35, List.of(
            new User("Сергей", 35, "Gazprom", "Краснодар")
        ));

        assertEquals(expected, actual);
    }
}