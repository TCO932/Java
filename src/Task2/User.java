package Task2;

import java.util.Set;

public class User {
    private static final Set<String> VALID_JOBS = Set.of("Google", "Uber", "Amazon");
    private static final Set<String> VALID_ADDRESSES = Set.of("London", "New York", "Amsterdam");

    private final String name;
    private final Integer age;
    private final String workplace;
    private final String address;

    public User(String name, Integer age, String workplace, String address) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else {
            this.name = name;
        }

        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        } else {
            this.age = age;
        }

        if (VALID_JOBS.contains(workplace)) {
            this.workplace = workplace;
        } else {
            throw new IllegalArgumentException("Invalid workplace");
        }

        if (VALID_ADDRESSES.contains(address)) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Invalid address");
        }
    }
}