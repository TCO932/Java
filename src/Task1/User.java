package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class User {
    String name;
    Integer age;
    String workplace;
    String address;

    public User(String name, int age, String workplace, String address) {
        this.name = name;
        this.age = age;
        this.workplace = workplace;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static Map<Integer, List<User>> groupUsers(List<User> users) {
        Map<Integer, List<User>> res = new TreeMap<>();

        users.forEach(user -> {
            List<User> group = res.get(user.age);
            if (group != null) {
                group.add(user);
            } else {
                ArrayList<User> newGroup = new ArrayList<>();
                newGroup.add(user);
                res.put(user.age, newGroup);
            }
        });

        return res;
    }
}