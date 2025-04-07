package Task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private String workplace;
    private String address;

    public static Map<Integer, List<User>> groupUsers(List<User> users) {
        Map<Integer, List<User>> res = new TreeMap<>();

        users.forEach(user -> {
            List<User> group = res.getOrDefault(user.age, new ArrayList<>());
            group.add(user);
            res.putIfAbsent(user.age, group);
        });

        return res;
    }
}