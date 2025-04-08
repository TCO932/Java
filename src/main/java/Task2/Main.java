package Task2;

public class Main {
    private static User createUser(String name, int age, String workplace, String address) {
        try {
            return new User(name, age, workplace, address);
        } catch (Exception e) {
            System.out.println("Creation failed: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // Корректный пользователь
        createUser("John Doe", 25, "Google", "London");

        // Невалидные случаи
        createUser(null, 30, "Uber", "New York");       // null
        createUser("", 30, "Uber", "New York");       // Пустое имя
        createUser("Alice", 17, "Amazon", "Amsterdam");  // Возраст < 18
        createUser("Bob", 35, "Microsoft", "London");   // Невалидная компания
        createUser("Charlie", 40, "Google", "Paris");     // Невалидный адрес;
    }
}