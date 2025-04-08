package Task4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User(1, "Анна", 25, Set.of("чтение", "плавание")),
            new User(3, "Вася", 22, Set.of("чтение", "рисование")),
            new User(2, "Иван", 30, Set.of("программирование", "плавание"))
        );

        Set<String> targetHobbies = Set.of("плавание", "рисование");
        Map<User, String> lovers = User.findHobbyLovers(users, targetHobbies);
        System.out.println(lovers);
    }
}