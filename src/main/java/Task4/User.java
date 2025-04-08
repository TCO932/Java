package Task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private @NonNull String name;
    private int age;
    private @NonNull Set<String> hobbies;

    public static Map<User, String> findHobbyLovers(@NonNull List<User> users, @NonNull Set<String> targetHobbies) {
        Map<User, String> result = new HashMap<>();

        for (User user : users) {
            Set<String> commonHobby = new HashSet<>(user.hobbies);
            commonHobby.retainAll(targetHobbies);

            if (!commonHobby.isEmpty()) {
                result.put(user, commonHobby.iterator().next());
            }
        }

        return result;
    }
}