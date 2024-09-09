package by.my.storage;

import by.my.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public class UserContainer {
    static ArrayList<User> arrayList = new ArrayList<>();

    public boolean saveUser(User user) {
        arrayList.add(user);
        return true;
    }


    public static boolean inspectRegistrationUser(User user1) {
        boolean inspect = false;

        for (User s : arrayList) {
            if (s.equals(user1))
                inspect = true;
        }
        return inspect;
    }
    public static Optional<User> getUser(String username, String password) {
        for (User s : arrayList) {
            if (s.getUsername().equals(username) && s.getUsername().equals(password))
                return Optional.of(s);

        }
       return Optional.empty();
    }

    public static ArrayList<User> getArrayList() {
        return new ArrayList<>(arrayList);
    }
}
