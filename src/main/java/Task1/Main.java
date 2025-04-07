package Task1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        // Добавляем пользователей с разными возрастами
        users.add(new User("Иван", 25, "Google", "Москва"));
        users.add(new User("Мария", 30, "Yandex", "Санкт-Петербург"));
        users.add(new User("Алексей", 25, "Mail.ru", "Казань"));
        users.add(new User("Ольга", 30, "Sber", "Новосибирск"));
        users.add(new User("Дмитрий", 28, "Tinkoff", "Екатеринбург"));
        users.add(new User("Анна", 25, "VK", "Самара"));
        users.add(new User("Сергей", 35, "Gazprom", "Краснодар"));
        users.add(new User("Елена", 28, "Ростелеком", "Воронеж"));
        users.add(new User("Павел", 30, "МТС", "Уфа"));
        users.add(new User("Наталья", 35, "Билайн", "Пермь"));
        users.add(new User("Артем", 40, "РЖД", "Омск"));
        users.add(new User("Виктория", 25, "Сибур", "Тюмень"));
        users.add(new User("Михаил", 40, "Лукойл", "Красноярск"));
        users.add(new User("Алина", 28, "Роснефть", "Иркутск"));
        users.add(new User("Кирилл", 30, "Норникель", "Хабаровск"));
        users.add(new User("Татьяна", 35, "Северсталь", "Владивосток"));
        users.add(new User("Андрей", 25, "Магнит", "Ростов-на-Дону"));
        users.add(new User("Екатерина", 40, "X5 Group", "Томск"));
        users.add(new User("Николай", 28, "DNS", "Калининград"));
        users.add(new User("Юлия", 30, "М.Видео", "Сочи"));


        Map<Integer, List<User>> usersGrouped = User.groupUsers(users);
        System.out.println(usersGrouped);
    }
}