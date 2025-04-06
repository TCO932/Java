package Task4;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

public class User{
    int id;
    String name;
    int age;
    Set<String> hobbies;

    public User(int id, String name, int age, Set<String> hobbies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public int compareTo(User other) {
//        return Integer.compare(this.id, other.id);
//    }

    public static Map<User, String> findHobbyLovers(List<User> users, Set<String> targetHobbies) {
        Map<User, String> result = new TreeMap<>();

        for (User user : users) {
            Optional<String> commonHobby = user.hobbies.stream()
                    .filter(targetHobbies::contains)
                    .findFirst();

            commonHobby.ifPresent(hobby -> result.put(user, hobby));
        }

        return result;
    }
}