package Task2;

import lombok.NonNull;

import java.util.Set;

public class User {
    private static final Set<String> VALID_JOBS = Set.of("Google", "Uber", "Amazon");
    private static final Set<String> VALID_ADDRESSES = Set.of("London", "New York", "Amsterdam");

    private final @NonNull String name;
    private final int age;
    private final @NonNull String workplace;
    private final @NonNull String address;

    public User(@NonNull String name, int age, @NonNull String workplace, @NonNull String address) throws IllegalArgumentException {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
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